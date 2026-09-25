package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18526a;
    public final NativeByteBuffer f18527b;
    public final AsyncTask f18528c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18526a = i10;
        this.f18528c = asyncTask;
        this.f18527b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18526a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18528c).lambda$onPostExecute$1(this.f18527b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18528c).lambda$onPostExecute$1(this.f18527b);
                return;
        }
    }
}
