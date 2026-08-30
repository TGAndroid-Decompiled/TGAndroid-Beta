package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f19371a;
    public final NativeByteBuffer f19372b;
    public final AsyncTask f19373c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19371a = i10;
        this.f19373c = asyncTask;
        this.f19372b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19371a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19373c).lambda$onPostExecute$1(this.f19372b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19373c).lambda$onPostExecute$1(this.f19372b);
                return;
        }
    }
}
