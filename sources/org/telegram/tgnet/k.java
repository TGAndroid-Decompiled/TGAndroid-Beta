package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18527a;
    public final NativeByteBuffer f18528b;
    public final AsyncTask f18529c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18527a = i10;
        this.f18529c = asyncTask;
        this.f18528b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18527a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18529c).lambda$onPostExecute$1(this.f18528b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18529c).lambda$onPostExecute$1(this.f18528b);
                return;
        }
    }
}
