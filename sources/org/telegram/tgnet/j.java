package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28597a;
    public final NativeByteBuffer f28598b;
    public final AsyncTask f28599c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28597a = i7;
        this.f28599c = asyncTask;
        this.f28598b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28597a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28599c).lambda$onPostExecute$1(this.f28598b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28599c).lambda$onPostExecute$1(this.f28598b);
                return;
        }
    }
}
