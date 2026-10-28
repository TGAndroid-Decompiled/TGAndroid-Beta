package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f22217a;
    public final NativeByteBuffer f22218b;
    public final AsyncTask f22219c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f22217a = i10;
        this.f22219c = asyncTask;
        this.f22218b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f22217a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f22219c).lambda$onPostExecute$1(this.f22218b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f22219c).lambda$onPostExecute$1(this.f22218b);
                return;
        }
    }
}
