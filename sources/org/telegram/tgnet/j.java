package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f27145a;
    public final NativeByteBuffer f27146b;
    public final AsyncTask f27147c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f27145a = i7;
        this.f27147c = asyncTask;
        this.f27146b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f27145a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f27147c).lambda$onPostExecute$1(this.f27146b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f27147c).lambda$onPostExecute$1(this.f27146b);
                return;
        }
    }
}
