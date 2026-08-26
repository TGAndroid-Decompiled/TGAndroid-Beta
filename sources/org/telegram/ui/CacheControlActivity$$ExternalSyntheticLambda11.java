package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class CacheControlActivity$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public CacheControlActivity$$ExternalSyntheticLambda11(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CacheControlActivity.lambda$calculateTotalSize$1(this.f$0);
                break;
            case 1:
                LoginActivity.LoginPayView.lambda$setParams$17(this.f$0);
                break;
            default:
                this.f$0.run("CANCELLED");
                break;
        }
    }
}
