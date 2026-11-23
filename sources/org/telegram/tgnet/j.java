package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28626a;
    public final NativeByteBuffer f28627b;
    public final AsyncTask f28628c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28626a = i7;
        this.f28628c = asyncTask;
        this.f28627b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28626a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28628c).lambda$onPostExecute$1(this.f28627b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28628c).lambda$onPostExecute$1(this.f28627b);
                return;
        }
    }
}
