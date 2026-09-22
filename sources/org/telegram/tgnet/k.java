package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18533a;
    public final NativeByteBuffer f18534b;
    public final AsyncTask f18535c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18533a = i10;
        this.f18535c = asyncTask;
        this.f18534b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18533a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18535c).lambda$onPostExecute$1(this.f18534b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18535c).lambda$onPostExecute$1(this.f18534b);
                return;
        }
    }
}
