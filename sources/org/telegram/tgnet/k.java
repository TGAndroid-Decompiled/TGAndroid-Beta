package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18311a;
    public final NativeByteBuffer f18312b;
    public final AsyncTask f18313c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18311a = i10;
        this.f18313c = asyncTask;
        this.f18312b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18311a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18313c).lambda$onPostExecute$1(this.f18312b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18313c).lambda$onPostExecute$1(this.f18312b);
                return;
        }
    }
}
