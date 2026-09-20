package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18518a;
    public final NativeByteBuffer f18519b;
    public final AsyncTask f18520c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18518a = i10;
        this.f18520c = asyncTask;
        this.f18519b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18518a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18520c).lambda$onPostExecute$1(this.f18519b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18520c).lambda$onPostExecute$1(this.f18519b);
                return;
        }
    }
}
