package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20239a;
    public final NativeByteBuffer f20240b;
    public final AsyncTask f20241c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20239a = i10;
        this.f20241c = asyncTask;
        this.f20240b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20239a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20241c).lambda$onPostExecute$1(this.f20240b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20241c).lambda$onPostExecute$1(this.f20240b);
                return;
        }
    }
}
