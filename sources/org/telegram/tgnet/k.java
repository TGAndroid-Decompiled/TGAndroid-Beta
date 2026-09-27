package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18519a;
    public final NativeByteBuffer f18520b;
    public final AsyncTask f18521c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18519a = i10;
        this.f18521c = asyncTask;
        this.f18520b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18519a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18521c).lambda$onPostExecute$1(this.f18520b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18521c).lambda$onPostExecute$1(this.f18520b);
                return;
        }
    }
}
