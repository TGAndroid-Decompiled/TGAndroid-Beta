package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f27152a;
    public final NativeByteBuffer f27153b;
    public final AsyncTask f27154c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f27152a = i7;
        this.f27154c = asyncTask;
        this.f27153b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f27152a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f27154c).lambda$onPostExecute$1(this.f27153b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f27154c).lambda$onPostExecute$1(this.f27153b);
                return;
        }
    }
}
