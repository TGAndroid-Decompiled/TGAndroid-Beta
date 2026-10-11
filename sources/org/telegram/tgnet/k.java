package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20224a;
    public final NativeByteBuffer f20225b;
    public final AsyncTask f20226c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20224a = i10;
        this.f20226c = asyncTask;
        this.f20225b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20224a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20226c).lambda$onPostExecute$1(this.f20225b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20226c).lambda$onPostExecute$1(this.f20225b);
                return;
        }
    }
}
