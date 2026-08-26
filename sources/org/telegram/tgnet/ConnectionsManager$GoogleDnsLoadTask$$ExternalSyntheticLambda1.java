package org.telegram.tgnet;

import android.os.AsyncTask;

public final class ConnectionsManager$GoogleDnsLoadTask$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final AsyncTask f$0;
    public final NativeByteBuffer f$1;

    public ConnectionsManager$GoogleDnsLoadTask$$ExternalSyntheticLambda1(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i) {
        this.$r8$classId = i;
        this.f$0 = asyncTask;
        this.f$1 = nativeByteBuffer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.f$0).lambda$onPostExecute$1(this.f$1);
                break;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.f$0).lambda$onPostExecute$1(this.f$1);
                break;
        }
    }
}
