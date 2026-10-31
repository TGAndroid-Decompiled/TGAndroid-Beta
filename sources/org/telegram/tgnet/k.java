package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f19986a;
    public final NativeByteBuffer f19987b;
    public final AsyncTask f19988c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19986a = i10;
        this.f19988c = asyncTask;
        this.f19987b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19986a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19988c).lambda$onPostExecute$1(this.f19987b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19988c).lambda$onPostExecute$1(this.f19987b);
                return;
        }
    }
}
