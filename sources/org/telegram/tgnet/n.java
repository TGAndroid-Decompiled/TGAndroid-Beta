package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class n implements Runnable {
    public final int f17393a;
    public final NativeByteBuffer f17394b;
    public final AsyncTask f17395c;

    public n(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f17393a = i10;
        this.f17395c = asyncTask;
        this.f17394b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f17393a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f17395c).lambda$onPostExecute$1(this.f17394b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f17395c).lambda$onPostExecute$1(this.f17394b);
                return;
        }
    }
}
