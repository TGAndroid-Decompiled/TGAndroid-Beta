package org.telegram.ui.Stars;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;

public final class StarsIntroActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final BottomSheet[] f$0;
    public final TL_stars.StarsTransaction f$1;
    public final long f$2;

    public StarsIntroActivity$$ExternalSyntheticLambda9(BottomSheet[] bottomSheetArr, long j, TL_stars.StarsTransaction starsTransaction) {
        this.$r8$classId = 3;
        this.f$0 = bottomSheetArr;
        this.f$2 = j;
        this.f$1 = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f$1;
                    int i = starsTransaction.flags & 8192;
                    long j = this.f$2;
                    if (i == 0) {
                        safeLastFragment.presentFragment(ChatActivity.of(j));
                    } else {
                        safeLastFragment.presentFragment(ChatActivity.of(j, starsTransaction.giveaway_post_id));
                    }
                }
                break;
            case 1:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f$1;
                    int i2 = starsTransaction2.flags & 8192;
                    long j2 = this.f$2;
                    if (i2 == 0) {
                        safeLastFragment2.presentFragment(ChatActivity.of(j2));
                    } else {
                        safeLastFragment2.presentFragment(ChatActivity.of(j2, starsTransaction2.giveaway_post_id));
                    }
                }
                break;
            case 2:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f$1;
                    int i3 = starsTransaction3.flags & 8192;
                    long j3 = this.f$2;
                    if (i3 == 0) {
                        safeLastFragment3.presentFragment(ChatActivity.of(j3));
                    } else {
                        safeLastFragment3.presentFragment(ChatActivity.of(j3, starsTransaction3.giveaway_post_id));
                    }
                }
                break;
            case 3:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.f$2);
                    bundle.putInt("message_id", this.f$1.msg_id);
                    safeLastFragment4.presentFragment(new ChatActivity(bundle));
                }
                break;
            default:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment5 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f$1;
                    int i4 = starsTransaction4.flags & 8192;
                    long j4 = this.f$2;
                    if (i4 == 0) {
                        safeLastFragment5.presentFragment(ChatActivity.of(j4));
                    } else {
                        safeLastFragment5.presentFragment(ChatActivity.of(j4, starsTransaction4.giveaway_post_id));
                    }
                }
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda9(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetArr;
        this.f$1 = starsTransaction;
        this.f$2 = j;
    }
}
