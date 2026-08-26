package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class CacheControlActivity$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;
    public final ChatActivity$$ExternalSyntheticLambda464 f$1;
    public final CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 f$2;

    public CacheControlActivity$$ExternalSyntheticLambda20(CacheControlActivity cacheControlActivity, ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464, CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
        this.f$1 = chatActivity$$ExternalSyntheticLambda464;
        this.f$2 = cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.globalQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda20(this.f$0, this.f$1, this.f$2, 1));
                break;
            default:
                this.f$0.lambda$cleanupFolders$11(this.f$1, this.f$2);
                break;
        }
    }
}
