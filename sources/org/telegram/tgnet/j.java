package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f19346a;
    public final NativeByteBuffer f19347b;
    public final AsyncTask f19348c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19346a = i10;
        this.f19348c = asyncTask;
        this.f19347b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19348c).lambda$onPostExecute$1(this.f19347b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19348c).lambda$onPostExecute$1(this.f19347b);
                return;
        }
    }
}
