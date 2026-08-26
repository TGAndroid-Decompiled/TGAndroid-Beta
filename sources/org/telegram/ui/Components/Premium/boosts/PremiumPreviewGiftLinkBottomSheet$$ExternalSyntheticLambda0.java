package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.DialogsActivity;

public final class PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PremiumPreviewGiftLinkBottomSheet f$0;

    public PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = premiumPreviewGiftLinkBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = this.f$0;
                String str = "https://t.me/giftcode/" + premiumPreviewGiftLinkBottomSheet.slug;
                DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m(3, "onlySelect", "dialogsType", true));
                dialogsActivity.delegate = new RateCallLayout$$ExternalSyntheticLambda1(14, premiumPreviewGiftLinkBottomSheet, str);
                premiumPreviewGiftLinkBottomSheet.baseFragment.presentFragment(dialogsActivity);
                premiumPreviewGiftLinkBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$init$1();
                break;
        }
    }
}
