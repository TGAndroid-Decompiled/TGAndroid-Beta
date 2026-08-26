package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class StoryCaptionView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StoryCaptionView f$0;
    public final float f$1;
    public final float f$3;

    public StoryCaptionView$$ExternalSyntheticLambda0(StoryCaptionView storyCaptionView, float f, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = storyCaptionView;
        this.f$1 = f;
        this.f$3 = f2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                StoryCaptionView storyCaptionView = this.f$0;
                storyCaptionView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyCaptionView.setScrollY((int) AndroidUtilities.lerp(this.f$1, 0.0f, fFloatValue));
                float fLerp = AndroidUtilities.lerp(this.f$3, 0.0f, fFloatValue);
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView = storyCaptionView.captionTextview;
                storyCaptionTextView.progressToExpand = fLerp;
                storyCaptionTextView.invalidate();
                break;
            default:
                StoryCaptionView storyCaptionView2 = this.f$0;
                storyCaptionView2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyCaptionView2.setScrollY((int) AndroidUtilities.lerp(this.f$1, Math.min((storyCaptionView2.getMeasuredHeight() - storyCaptionView2.blackoutBottomOffset) - AndroidUtilities.dp(64.0f), storyCaptionView2.captionContainer.getBottom() - storyCaptionView2.getMeasuredHeight()), fFloatValue2));
                float fLerp2 = AndroidUtilities.lerp(this.f$3, 1.0f, fFloatValue2);
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView2 = storyCaptionView2.captionTextview;
                storyCaptionTextView2.progressToExpand = fLerp2;
                storyCaptionTextView2.invalidate();
                break;
        }
    }
}
