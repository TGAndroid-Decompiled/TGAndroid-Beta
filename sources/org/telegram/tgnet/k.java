package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f18486a;
    public final NativeByteBuffer f18487b;
    public final AsyncTask f18488c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f18486a = i10;
        this.f18488c = asyncTask;
        this.f18487b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f18486a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f18488c).lambda$onPostExecute$1(this.f18487b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f18488c).lambda$onPostExecute$1(this.f18487b);
                return;
        }
    }
}
