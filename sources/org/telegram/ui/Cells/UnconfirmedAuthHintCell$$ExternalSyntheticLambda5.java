package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;

public final class UnconfirmedAuthHintCell$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public UnconfirmedAuthHintCell$$ExternalSyntheticLambda5(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BottomSheet bottomSheet = this.f$0;
                bottomSheet.setCanDismissWithSwipe(true);
                bottomSheet.setCanDismissWithTouchOutside(true);
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(13), 220L);
                break;
        }
    }
}
