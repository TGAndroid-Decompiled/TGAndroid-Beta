package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;

public final class CreateBotAlert$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public CreateBotAlert$$ExternalSyntheticLambda9(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                }
                break;
            case 1:
                BottomSheet bottomSheet = this.f$0;
                bottomSheet.setCanDismissWithSwipe(true);
                bottomSheet.setCanDismissWithTouchOutside(true);
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(2), 220L);
                break;
        }
    }
}
