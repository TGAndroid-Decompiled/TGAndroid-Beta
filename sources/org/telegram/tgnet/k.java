package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18302a;
    public final NativeByteBuffer f18303b;
    public final AsyncTask f18304c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18302a = i10;
        this.f18304c = asyncTask;
        this.f18303b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18302a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18304c).lambda$onPostExecute$1(this.f18303b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18304c).lambda$onPostExecute$1(this.f18303b);
                return;
        }
    }
}
