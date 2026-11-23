package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f28686a;
    public final NativeByteBuffer f28687b;
    public final AsyncTask f28688c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28686a = i7;
        this.f28688c = asyncTask;
        this.f28687b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28686a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28688c).lambda$onPostExecute$1(this.f28687b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28688c).lambda$onPostExecute$1(this.f28687b);
                return;
        }
    }
}
