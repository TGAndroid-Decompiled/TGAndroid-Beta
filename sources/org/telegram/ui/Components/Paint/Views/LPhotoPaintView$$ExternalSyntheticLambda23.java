package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;

public final class LPhotoPaintView$$ExternalSyntheticLambda23 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda23(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                LPhotoPaintView lPhotoPaintView = this.f$0;
                lPhotoPaintView.getClass();
                lPhotoPaintView.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                LPhotoPaintView lPhotoPaintView2 = this.f$0;
                lPhotoPaintView2.getClass();
                lPhotoPaintView2.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
