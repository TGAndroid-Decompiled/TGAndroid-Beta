package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f22214a;
    public final NativeByteBuffer f22215b;
    public final AsyncTask f22216c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f22214a = i10;
        this.f22216c = asyncTask;
        this.f22215b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f22214a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f22216c).lambda$onPostExecute$1(this.f22215b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f22216c).lambda$onPostExecute$1(this.f22215b);
                return;
        }
    }
}
