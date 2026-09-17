package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f20088a;
    public final NativeByteBuffer f20089b;
    public final AsyncTask f20090c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20088a = i10;
        this.f20090c = asyncTask;
        this.f20089b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20088a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20090c).lambda$onPostExecute$1(this.f20089b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20090c).lambda$onPostExecute$1(this.f20089b);
                return;
        }
    }
}
