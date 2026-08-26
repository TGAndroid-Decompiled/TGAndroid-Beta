package org.telegram.ui.Components.Premium;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.browser.Browser;

public final class PremiumPreviewBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PremiumPreviewBottomSheet f$0;

    public PremiumPreviewBottomSheet$$ExternalSyntheticLambda1(PremiumPreviewBottomSheet premiumPreviewBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = premiumPreviewBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = this.f$0;
                Browser.openUrl(premiumPreviewBottomSheet.getContext(), "https://" + MessagesController.getInstance(premiumPreviewBottomSheet.currentAccount).linkPrefix + "/nft/" + premiumPreviewBottomSheet.emojiStatusCollectible.slug);
                break;
            case 1:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet2 = this.f$0;
                try {
                    premiumPreviewBottomSheet2.container.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                premiumPreviewBottomSheet2.fireworksOverlay.start(premiumPreviewBottomSheet2.animateConfettiWithStars);
                break;
            default:
                this.f$0.titleView[0].setVisibility(8);
                break;
        }
    }
}
