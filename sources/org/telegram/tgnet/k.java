package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18511a;
    public final NativeByteBuffer f18512b;
    public final AsyncTask f18513c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18511a = i10;
        this.f18513c = asyncTask;
        this.f18512b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18511a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18513c).lambda$onPostExecute$1(this.f18512b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18513c).lambda$onPostExecute$1(this.f18512b);
                return;
        }
    }
}
