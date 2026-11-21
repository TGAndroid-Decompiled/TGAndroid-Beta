package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28623a;
    public final NativeByteBuffer f28624b;
    public final AsyncTask f28625c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28623a = i7;
        this.f28625c = asyncTask;
        this.f28624b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28623a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28625c).lambda$onPostExecute$1(this.f28624b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28625c).lambda$onPostExecute$1(this.f28624b);
                return;
        }
    }
}
