package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f22581a;
    public final NativeByteBuffer f22582b;
    public final AsyncTask f22583c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f22581a = i10;
        this.f22583c = asyncTask;
        this.f22582b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f22581a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f22583c).lambda$onPostExecute$1(this.f22582b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f22583c).lambda$onPostExecute$1(this.f22582b);
                return;
        }
    }
}
