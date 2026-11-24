package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final byte a;
    public final NativeByteBuffer b;
    public final AsyncTask c;

    public b(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, byte b) {
        this.a = b;
        this.c = asyncTask;
        this.b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        byte b = this.a;
        NativeByteBuffer nativeByteBuffer = this.b;
        AsyncTask asyncTask = this.c;
        switch (b) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) asyncTask).lambda$onPostExecute$1(nativeByteBuffer);
                return;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) asyncTask).lambda$onPostExecute$1(nativeByteBuffer);
                return;
        }
    }
}
