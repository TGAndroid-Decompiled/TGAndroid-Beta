package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class PremiumPreviewBottomSheet$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PremiumPreviewBottomSheet f$0;

    public PremiumPreviewBottomSheet$$ExternalSyntheticLambda5(PremiumPreviewBottomSheet premiumPreviewBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = premiumPreviewBottomSheet;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = this.f$0;
                premiumPreviewBottomSheet.getClass();
                premiumPreviewBottomSheet.enterTransitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                premiumPreviewBottomSheet.container.invalidate();
                break;
            default:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet2 = this.f$0;
                premiumPreviewBottomSheet2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                premiumPreviewBottomSheet2.titleViewContainer.getLayoutParams().height = AndroidUtilities.lerp(premiumPreviewBottomSheet2.titleView[0].getHeight(), premiumPreviewBottomSheet2.titleView[1].getHeight(), fFloatValue);
                premiumPreviewBottomSheet2.titleViewContainer.requestLayout();
                break;
        }
    }
}
