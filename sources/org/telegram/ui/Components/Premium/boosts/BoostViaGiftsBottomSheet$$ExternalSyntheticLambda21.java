package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda103;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.LaunchActivity;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21 implements Utilities.Callback {
    public final BoostViaGiftsBottomSheet f$0;
    public final TL_stories.TL_prepaidStarsGiveaway f$1;
    public final long f$2;
    public final long f$3;
    public final TL_stories.PrepaidGiveaway f$4;

    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, long j2, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f$0 = boostViaGiftsBottomSheet;
        this.f$1 = tL_prepaidStarsGiveaway;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this.f$0;
        boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
        if (this.f$1 == null) {
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(27, boostViaGiftsBottomSheet, this.f$4), 220L);
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            ChatActivity chatActivityOf = ChatActivity.of(this.f$2);
            chatActivityOf.whenFullyVisible(new ChatActivity$$ExternalSyntheticLambda103(chatActivityOf, this.f$3, 7));
            safeLastFragment.presentFragment(chatActivityOf);
        }
    }
}
