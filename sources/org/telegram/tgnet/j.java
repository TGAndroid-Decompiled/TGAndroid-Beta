package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28243a;
    public final NativeByteBuffer f28244b;
    public final AsyncTask f28245c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28243a = i7;
        this.f28245c = asyncTask;
        this.f28244b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28243a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28245c).lambda$onPostExecute$1(this.f28244b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28245c).lambda$onPostExecute$1(this.f28244b);
                return;
        }
    }
}
