package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18542a;
    public final NativeByteBuffer f18543b;
    public final AsyncTask f18544c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18542a = i10;
        this.f18544c = asyncTask;
        this.f18543b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18542a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18544c).lambda$onPostExecute$1(this.f18543b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18544c).lambda$onPostExecute$1(this.f18543b);
                return;
        }
    }
}
