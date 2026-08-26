package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

public final class CacheChatsExceptionsFragment$$ExternalSyntheticLambda3 implements KeepMediaPopupView.Callback {
    public final int $r8$classId;
    public final CacheChatsExceptionsFragment f$0;
    public final CacheByChatsController.KeepMediaException f$1;

    public CacheChatsExceptionsFragment$$ExternalSyntheticLambda3(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, CacheByChatsController.KeepMediaException keepMediaException, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheChatsExceptionsFragment;
        this.f$1 = keepMediaException;
    }

    @Override
    public final void onKeepMediaChange(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = CacheByChatsController.KEEP_MEDIA_DELETE;
                CacheChatsExceptionsFragment cacheChatsExceptionsFragment = this.f$0;
                CacheByChatsController.KeepMediaException keepMediaException = this.f$1;
                if (i == i2) {
                    cacheChatsExceptionsFragment.exceptionsDialogs.remove(keepMediaException);
                    cacheChatsExceptionsFragment.updateRows$24();
                } else {
                    keepMediaException.keepMedia = i;
                    AndroidUtilities.updateVisibleRows(cacheChatsExceptionsFragment.recyclerListView);
                }
                cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
                break;
            default:
                CacheChatsExceptionsFragment cacheChatsExceptionsFragment2 = this.f$0;
                cacheChatsExceptionsFragment2.getClass();
                this.f$1.keepMedia = i;
                cacheChatsExceptionsFragment2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment2.currentType, cacheChatsExceptionsFragment2.exceptionsDialogs);
                AndroidUtilities.updateVisibleRows(cacheChatsExceptionsFragment2.recyclerListView);
                break;
        }
    }
}
