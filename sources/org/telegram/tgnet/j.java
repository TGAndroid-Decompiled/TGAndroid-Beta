package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20531a;
    public final NativeByteBuffer f20532b;
    public final AsyncTask f20533c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20531a = i10;
        this.f20533c = asyncTask;
        this.f20532b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20531a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20533c).lambda$onPostExecute$1(this.f20532b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20533c).lambda$onPostExecute$1(this.f20532b);
                return;
        }
    }
}
