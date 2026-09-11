package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20061a;
    public final NativeByteBuffer f20062b;
    public final AsyncTask f20063c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20061a = i10;
        this.f20063c = asyncTask;
        this.f20062b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20061a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20063c).lambda$onPostExecute$1(this.f20062b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20063c).lambda$onPostExecute$1(this.f20062b);
                return;
        }
    }
}
