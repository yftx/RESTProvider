
package novoda.rest;

import java.util.Map;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

import android.database.AbstractCursor;
import android.net.Uri;

public abstract class UriRequestMap {

    static final public int QUERY = 0;

    static final public int INSERT = 1;

    static final public int UPDATE = 2;

    static final public int DELETE = 3;

    /**
     * @param uri
     * @param type
     * @param params
     * @return
     */
    public abstract HttpUriRequest getRequest(Uri uri, int type, Map<String, String> params);

    public abstract ResponseHandler<? extends AbstractCursor> getQueryHandler(Uri uri);

    public abstract ResponseHandler<? extends Uri> getInsertHandler(Uri uri);

    public abstract ResponseHandler<? extends Integer> getUpdateHandler(Uri uri);

    public abstract ResponseHandler<? extends Integer> getDeleteHandler(Uri uri);
}