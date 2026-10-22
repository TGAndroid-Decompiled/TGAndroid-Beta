package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Runnable {
    public final int f20466a;
    public final NativeByteBuffer f20467b;
    public final AsyncTask f20468c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f20466a = i10;
        this.f20468c = asyncTask;
        this.f20467b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f20466a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f20468c).lambda$onPostExecute$1(this.f20467b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f20468c).lambda$onPostExecute$1(this.f20467b);
                return;
        }
    }
}
