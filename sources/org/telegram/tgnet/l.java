package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class l implements Runnable {
    public final int f19998a;
    public final NativeByteBuffer f19999b;
    public final AsyncTask f20000c;

    public l(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19998a = i10;
        this.f20000c = asyncTask;
        this.f19999b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19998a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20000c).lambda$onPostExecute$1(this.f19999b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20000c).lambda$onPostExecute$1(this.f19999b);
                return;
        }
    }
}
