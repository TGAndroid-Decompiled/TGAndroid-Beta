package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f27148a;
    public final NativeByteBuffer f27149b;
    public final AsyncTask f27150c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f27148a = i7;
        this.f27150c = asyncTask;
        this.f27149b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f27148a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f27150c).lambda$onPostExecute$1(this.f27149b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f27150c).lambda$onPostExecute$1(this.f27149b);
                return;
        }
    }
}
