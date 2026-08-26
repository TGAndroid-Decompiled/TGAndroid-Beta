package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;

public final class LPhotoPaintView$$ExternalSyntheticLambda20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda20(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showEmojiPopup$46(valueAnimator);
                break;
            default:
                this.f$0.lambda$hideEmojiPopup$47(valueAnimator);
                break;
        }
    }
}
