package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18299a;
    public final NativeByteBuffer f18300b;
    public final AsyncTask f18301c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18299a = i10;
        this.f18301c = asyncTask;
        this.f18300b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18299a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18301c).lambda$onPostExecute$1(this.f18300b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18301c).lambda$onPostExecute$1(this.f18300b);
                return;
        }
    }
}
