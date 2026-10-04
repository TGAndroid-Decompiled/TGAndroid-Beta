package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20234a;
    public final NativeByteBuffer f20235b;
    public final AsyncTask f20236c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20234a = i10;
        this.f20236c = asyncTask;
        this.f20235b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20234a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20236c).lambda$onPostExecute$1(this.f20235b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20236c).lambda$onPostExecute$1(this.f20235b);
                return;
        }
    }
}
