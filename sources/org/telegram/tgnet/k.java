package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18273a;
    public final NativeByteBuffer f18274b;
    public final AsyncTask f18275c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18273a = i10;
        this.f18275c = asyncTask;
        this.f18274b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18275c).lambda$onPostExecute$1(this.f18274b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18275c).lambda$onPostExecute$1(this.f18274b);
                return;
        }
    }
}
