package org.telegram.ui.Components.Premium;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda0(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
                AndroidUtilities.addToClipboard(limitReachedBottomSheet.getBoostLink());
                limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                this.f$0.lambda$onViewCreated$14();
                break;
            case 2:
                LimitReachedBottomSheet.AnonymousClass1 anonymousClass1 = this.f$0.premiumButtonView;
                if (!anonymousClass1.showOverlay) {
                    anonymousClass1.buttonLayout.performClick();
                } else {
                    anonymousClass1.overlayTextView.performClick();
                }
                break;
            default:
                LimitReachedBottomSheet.AnonymousClass1 anonymousClass2 = this.f$0.premiumButtonView;
                if (!anonymousClass2.showOverlay) {
                    anonymousClass2.buttonLayout.performClick();
                } else {
                    anonymousClass2.overlayTextView.performClick();
                }
                break;
        }
    }
}
