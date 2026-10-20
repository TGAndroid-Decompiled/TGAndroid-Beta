package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20463a;
    public final NativeByteBuffer f20464b;
    public final AsyncTask f20465c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20463a = i10;
        this.f20465c = asyncTask;
        this.f20464b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20463a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20465c).lambda$onPostExecute$1(this.f20464b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20465c).lambda$onPostExecute$1(this.f20464b);
                return;
        }
    }
}
