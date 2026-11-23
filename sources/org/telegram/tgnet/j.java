package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f28590a;
    public final NativeByteBuffer f28591b;
    public final AsyncTask f28592c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.f28590a = i7;
        this.f28592c = asyncTask;
        this.f28591b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f28590a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f28592c).lambda$onPostExecute$1(this.f28591b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f28592c).lambda$onPostExecute$1(this.f28591b);
                return;
        }
    }
}
