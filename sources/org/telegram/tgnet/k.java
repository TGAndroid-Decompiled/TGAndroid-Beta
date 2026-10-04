package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20230a;
    public final NativeByteBuffer f20231b;
    public final AsyncTask f20232c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20230a = i10;
        this.f20232c = asyncTask;
        this.f20231b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20230a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20232c).lambda$onPostExecute$1(this.f20231b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20232c).lambda$onPostExecute$1(this.f20231b);
                return;
        }
    }
}
