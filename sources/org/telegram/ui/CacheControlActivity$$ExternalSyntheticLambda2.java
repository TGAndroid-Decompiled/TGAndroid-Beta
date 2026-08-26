package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class CacheControlActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;
    public final Utilities.Callback2 f$1;
    public final Runnable f$2;

    public CacheControlActivity$$ExternalSyntheticLambda2(CacheControlActivity cacheControlActivity, Utilities.Callback2 callback2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
        this.f$1 = callback2;
        this.f$2 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cleanupFolders$12(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$cleanupFolders$11(this.f$1, this.f$2);
                break;
        }
    }
}
