package org.telegram.tgnet;

import org.telegram.messenger.AndroidUtilities;

public final class ConnectionsManager$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;

    public ConnectionsManager$$ExternalSyntheticLambda2(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ConnectionsManager.lambda$cancelRequest$9(this.f$0);
                break;
            case 1:
                Runnable runnable = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 2:
                Runnable runnable2 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                break;
            default:
                Runnable runnable3 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                break;
        }
    }
}
