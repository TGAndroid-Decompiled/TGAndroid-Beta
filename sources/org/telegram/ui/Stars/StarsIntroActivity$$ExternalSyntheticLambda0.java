package org.telegram.ui.Stars;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class StarsIntroActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet[] f$0;
    public final long f$1;

    public StarsIntroActivity$$ExternalSyntheticLambda0(BottomSheet[] bottomSheetArr, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetArr;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BottomSheet bottomSheet = this.f$0[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ChatActivity.of(this.f$1));
                    break;
                }
                break;
            case 1:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(ChatActivity.of(this.f$1));
                }
                break;
            case 2:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment3 != null) {
                    safeLastFragment3.presentFragment(new AffiliateProgramFragment(this.f$1));
                }
                break;
            case 3:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment4 != null) {
                    safeLastFragment4.presentFragment(ProfileActivity.of(this.f$1));
                }
                break;
            case 4:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment5 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment5 != null) {
                    safeLastFragment5.presentFragment(ProfileActivity.of(this.f$1));
                }
                break;
            case 5:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment6 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment6 != null) {
                    safeLastFragment6.presentFragment(ProfileActivity.of(this.f$1));
                }
                break;
            default:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment7 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment7 != null) {
                    safeLastFragment7.presentFragment(ChatActivity.of(this.f$1));
                }
                break;
        }
    }
}
