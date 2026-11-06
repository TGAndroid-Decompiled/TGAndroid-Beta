package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f27144a;
    public final NativeByteBuffer f27145b;
    public final AsyncTask f27146c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f27144a = i7;
        this.f27146c = asyncTask;
        this.f27145b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f27144a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f27146c).lambda$onPostExecute$1(this.f27145b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f27146c).lambda$onPostExecute$1(this.f27145b);
                return;
        }
    }
}
