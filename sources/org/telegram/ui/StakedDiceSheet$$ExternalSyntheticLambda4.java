package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class StakedDiceSheet$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final long f$1;

    public StakedDiceSheet$$ExternalSyntheticLambda4(long j, int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StakedDiceSheet.lambda$showStakeToast$8(this.f$0, this.f$1);
                break;
            default:
                CacheControlActivity.lambda$calculateTotalSize$0(this.f$0, this.f$1);
                break;
        }
    }
}
