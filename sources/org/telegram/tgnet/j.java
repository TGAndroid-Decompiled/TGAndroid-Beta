package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f27193a;
    public final NativeByteBuffer f27194b;
    public final AsyncTask f27195c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i3) {
        this.f27193a = i3;
        this.f27195c = asyncTask;
        this.f27194b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f27193a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f27195c).lambda$onPostExecute$1(this.f27194b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f27195c).lambda$onPostExecute$1(this.f27194b);
                return;
        }
    }
}
