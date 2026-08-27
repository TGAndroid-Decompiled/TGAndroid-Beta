package org.telegram.tgnet;

import android.os.AsyncTask;

public final class j implements Runnable {

    public final int f22569a;

    public final NativeByteBuffer f22570b;

    public final AsyncTask f22571c;

    public j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.f22569a = i10;
        this.f22571c = asyncTask;
        this.f22570b = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f22569a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f22571c).lambda$onPostExecute$1(this.f22570b);
                break;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f22571c).lambda$onPostExecute$1(this.f22570b);
                break;
        }
    }
}
