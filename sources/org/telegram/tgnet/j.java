package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f21034a;
    public final NativeByteBuffer f21035b;
    public final AsyncTask f21036c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f21034a = i10;
        this.f21036c = asyncTask;
        this.f21035b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f21034a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f21036c).lambda$onPostExecute$1(this.f21035b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f21036c).lambda$onPostExecute$1(this.f21035b);
                return;
        }
    }
}
