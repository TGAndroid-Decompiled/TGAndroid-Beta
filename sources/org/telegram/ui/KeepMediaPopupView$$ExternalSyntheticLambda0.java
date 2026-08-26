package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

public final class KeepMediaPopupView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CacheChatsExceptionsFragment f$0;
    public final CacheByChatsController.KeepMediaException f$1;

    public KeepMediaPopupView$$ExternalSyntheticLambda0(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, int i, CacheByChatsController.KeepMediaException keepMediaException) {
        this.$r8$classId = i;
        this.f$0 = cacheChatsExceptionsFragment;
        this.f$1 = keepMediaException;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showPopupFor(this.f$1);
                break;
            default:
                this.f$0.lambda$showPopupFor$5(this.f$1);
                break;
        }
    }
}
