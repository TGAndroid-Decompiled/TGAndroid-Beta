package org.telegram.ui.Stories;

import org.telegram.messenger.AndroidUtilities;

public final class PeerStoriesView$$ExternalSyntheticLambda58 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;
    public final long f$1;

    public PeerStoriesView$$ExternalSyntheticLambda58(int i, long j, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Runnable runnable = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f$1)));
                break;
            case 1:
                Runnable runnable2 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f$1)));
                break;
            default:
                Runnable runnable3 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f$1)));
                break;
        }
    }
}
