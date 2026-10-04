package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20229a;
    public final NativeByteBuffer f20230b;
    public final AsyncTask f20231c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20229a = i10;
        this.f20231c = asyncTask;
        this.f20230b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20229a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20231c).lambda$onPostExecute$1(this.f20230b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20231c).lambda$onPostExecute$1(this.f20230b);
                return;
        }
    }
}
