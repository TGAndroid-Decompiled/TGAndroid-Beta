package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20530a;
    public final NativeByteBuffer f20531b;
    public final AsyncTask f20532c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20530a = i10;
        this.f20532c = asyncTask;
        this.f20531b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20530a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20532c).lambda$onPostExecute$1(this.f20531b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20532c).lambda$onPostExecute$1(this.f20531b);
                return;
        }
    }
}
