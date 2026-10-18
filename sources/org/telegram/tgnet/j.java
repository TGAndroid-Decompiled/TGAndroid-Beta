package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20459a;
    public final NativeByteBuffer f20460b;
    public final AsyncTask f20461c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20459a = i10;
        this.f20461c = asyncTask;
        this.f20460b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20459a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20461c).lambda$onPostExecute$1(this.f20460b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20461c).lambda$onPostExecute$1(this.f20460b);
                return;
        }
    }
}
