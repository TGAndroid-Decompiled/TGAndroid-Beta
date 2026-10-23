package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20467a;
    public final NativeByteBuffer f20468b;
    public final AsyncTask f20469c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20467a = i10;
        this.f20469c = asyncTask;
        this.f20468b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20467a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20469c).lambda$onPostExecute$1(this.f20468b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20469c).lambda$onPostExecute$1(this.f20468b);
                return;
        }
    }
}
