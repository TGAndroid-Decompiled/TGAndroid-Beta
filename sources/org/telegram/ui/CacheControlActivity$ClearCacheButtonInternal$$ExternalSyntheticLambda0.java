package org.telegram.ui;

import org.telegram.ui.ActionBar.BottomSheet;

public final class CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;
    public final CacheControlActivity.ClearingCacheView f$1;
    public final long[] f$2;
    public final BottomSheet f$3;

    public CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda0(boolean[] zArr, CacheControlActivity.ClearingCacheView clearingCacheView, long[] jArr, BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
        this.f$1 = clearingCacheView;
        this.f$2 = jArr;
        this.f$3 = bottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CacheControlActivity.ClearCacheButtonInternal.lambda$doClearCache$5(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                CacheControlActivity.ClearCacheButtonInternal.lambda$doClearCache$6(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
