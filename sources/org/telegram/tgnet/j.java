package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28595a;
    public final NativeByteBuffer f28596b;
    public final AsyncTask f28597c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28595a = i7;
        this.f28597c = asyncTask;
        this.f28596b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28595a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28597c).lambda$onPostExecute$1(this.f28596b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28597c).lambda$onPostExecute$1(this.f28596b);
                return;
        }
    }
}
