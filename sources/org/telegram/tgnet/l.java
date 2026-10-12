package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class l implements Runnable {
    public final int f19997a;
    public final NativeByteBuffer f19998b;
    public final AsyncTask f19999c;

    public l(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19997a = i10;
        this.f19999c = asyncTask;
        this.f19998b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19999c).lambda$onPostExecute$1(this.f19998b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19999c).lambda$onPostExecute$1(this.f19998b);
                return;
        }
    }
}
