package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f21032a;
    public final NativeByteBuffer f21033b;
    public final AsyncTask f21034c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f21032a = i10;
        this.f21034c = asyncTask;
        this.f21033b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f21032a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f21034c).lambda$onPostExecute$1(this.f21033b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f21034c).lambda$onPostExecute$1(this.f21033b);
                return;
        }
    }
}
