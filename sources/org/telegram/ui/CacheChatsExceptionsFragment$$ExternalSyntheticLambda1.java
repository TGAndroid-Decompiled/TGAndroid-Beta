package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

public final class CacheChatsExceptionsFragment$$ExternalSyntheticLambda1 implements KeepMediaPopupView.Callback {
    public final int $r8$classId;
    public final CacheChatsExceptionsFragment f$0;
    public final CacheByChatsController.KeepMediaException f$1;

    public CacheChatsExceptionsFragment$$ExternalSyntheticLambda1(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, int i, CacheByChatsController.KeepMediaException keepMediaException) {
        this.$r8$classId = i;
        this.f$0 = cacheChatsExceptionsFragment;
        this.f$1 = keepMediaException;
    }

    @Override
    public final void onKeepMediaChange(int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPopupFor$4(this.f$1, i, i2);
                break;
            default:
                this.f$0.lambda$createView$1(this.f$1, i, i2);
                break;
        }
    }
}
