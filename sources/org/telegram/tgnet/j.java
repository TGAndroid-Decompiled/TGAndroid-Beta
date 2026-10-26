package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f22216a;
    public final NativeByteBuffer f22217b;
    public final AsyncTask f22218c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f22216a = i10;
        this.f22218c = asyncTask;
        this.f22217b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f22216a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f22218c).lambda$onPostExecute$1(this.f22217b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f22218c).lambda$onPostExecute$1(this.f22217b);
                return;
        }
    }
}
