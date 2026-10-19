package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20460a;
    public final NativeByteBuffer f20461b;
    public final AsyncTask f20462c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20460a = i10;
        this.f20462c = asyncTask;
        this.f20461b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20460a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20462c).lambda$onPostExecute$1(this.f20461b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20462c).lambda$onPostExecute$1(this.f20461b);
                return;
        }
    }
}
