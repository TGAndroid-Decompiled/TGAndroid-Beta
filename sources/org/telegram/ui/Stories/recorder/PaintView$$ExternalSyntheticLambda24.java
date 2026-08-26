package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;

public final class PaintView$$ExternalSyntheticLambda24 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PaintView f$0;

    public PaintView$$ExternalSyntheticLambda24(PaintView paintView, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = this.f$0;
                paintView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintView.reactionShowProgress = fFloatValue;
                paintView.reactionLayout.setTransitionProgress(fFloatValue);
                break;
            case 1:
                PaintView paintView2 = this.f$0;
                paintView2.getClass();
                paintView2.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                PaintView paintView3 = this.f$0;
                paintView3.getClass();
                paintView3.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
