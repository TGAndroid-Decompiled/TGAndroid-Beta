package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f19406a;
    public final NativeByteBuffer f19407b;
    public final AsyncTask f19408c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19406a = i10;
        this.f19408c = asyncTask;
        this.f19407b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19406a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19408c).lambda$onPostExecute$1(this.f19407b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19408c).lambda$onPostExecute$1(this.f19407b);
                return;
        }
    }
}
