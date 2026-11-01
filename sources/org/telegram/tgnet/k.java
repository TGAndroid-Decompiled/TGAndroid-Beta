package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f19987a;
    public final NativeByteBuffer f19988b;
    public final AsyncTask f19989c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19987a = i10;
        this.f19989c = asyncTask;
        this.f19988b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19987a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19989c).lambda$onPostExecute$1(this.f19988b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19989c).lambda$onPostExecute$1(this.f19988b);
                return;
        }
    }
}
