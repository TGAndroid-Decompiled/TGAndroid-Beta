package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20260a;
    public final NativeByteBuffer f20261b;
    public final AsyncTask f20262c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20260a = i10;
        this.f20262c = asyncTask;
        this.f20261b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20260a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20262c).lambda$onPostExecute$1(this.f20261b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20262c).lambda$onPostExecute$1(this.f20261b);
                return;
        }
    }
}
