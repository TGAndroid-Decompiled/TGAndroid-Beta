package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Runnable {
    public final int f19106a;
    public final NativeByteBuffer f19107b;
    public final AsyncTask f19108c;

    public k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f19106a = i10;
        this.f19108c = asyncTask;
        this.f19107b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f19108c).lambda$onPostExecute$1(this.f19107b);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f19108c).lambda$onPostExecute$1(this.f19107b);
                return;
        }
    }
}
