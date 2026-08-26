package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PrivateVideoPreviewDialogNew f$0;

    public PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5(PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew, int i) {
        this.$r8$classId = i;
        this.f$0 = privateVideoPreviewDialogNew;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.f$0;
                privateVideoPreviewDialogNew.getClass();
                privateVideoPreviewDialogNew.closeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                privateVideoPreviewDialogNew.invalidate();
                break;
            case 1:
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew2 = this.f$0;
                privateVideoPreviewDialogNew2.getClass();
                privateVideoPreviewDialogNew2.openProgress1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fDp = privateVideoPreviewDialogNew2.startLocationX + AndroidUtilities.dp(28.0f);
                float fDp2 = privateVideoPreviewDialogNew2.startLocationY + AndroidUtilities.dp(52.0f);
                float f = privateVideoPreviewDialogNew2.openProgress1;
                privateVideoPreviewDialogNew2.openTranslationX = fDp - (fDp * f);
                privateVideoPreviewDialogNew2.openTranslationY = fDp2 - (f * fDp2);
                privateVideoPreviewDialogNew2.invalidate();
                break;
            case 2:
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew3 = this.f$0;
                privateVideoPreviewDialogNew3.getClass();
                privateVideoPreviewDialogNew3.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                PrivateVideoPreviewDialogNew.AnonymousClass4 anonymousClass4 = privateVideoPreviewDialogNew3.positiveButton;
                anonymousClass4.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (iDp * privateVideoPreviewDialogNew3.openProgress2));
                anonymousClass4.requestLayout();
                break;
            default:
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew4 = this.f$0;
                privateVideoPreviewDialogNew4.getClass();
                privateVideoPreviewDialogNew4.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                privateVideoPreviewDialogNew4.updateTitlesLayout$1();
                break;
        }
    }
}
