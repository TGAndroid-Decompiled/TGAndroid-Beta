package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20462a;
    public final NativeByteBuffer f20463b;
    public final AsyncTask f20464c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20462a = i10;
        this.f20464c = asyncTask;
        this.f20463b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20462a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20464c).lambda$onPostExecute$1(this.f20463b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20464c).lambda$onPostExecute$1(this.f20463b);
                return;
        }
    }
}
