package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;
    public final CacheControlActivity.ClearingCacheView f$1;
    public final long[] f$2;
    public final CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1 f$3;

    public CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5(boolean[] zArr, CacheControlActivity.ClearingCacheView clearingCacheView, long[] jArr, CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
        this.f$1 = clearingCacheView;
        this.f$2 = jArr;
        this.f$3 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5(this.f$0, this.f$1, this.f$2, this.f$3, 1));
                break;
            default:
                this.f$0[0] = true;
                this.f$1.setProgress(1.0f);
                long[] jArr = this.f$2;
                long j = jArr[0];
                CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1 anonymousClass1 = this.f$3;
                if (j <= 0) {
                    anonymousClass1.lambda$showGiftOfferSheet$15();
                } else {
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda3(anonymousClass1, 22), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                }
                break;
        }
    }
}
