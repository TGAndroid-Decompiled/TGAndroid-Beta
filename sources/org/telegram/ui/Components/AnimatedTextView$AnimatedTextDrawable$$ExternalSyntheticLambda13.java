package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class AnimatedTextView$AnimatedTextDrawable$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final AnimatedTextView.AnimatedTextDrawable f$0;
    public final int f$1;
    public final int f$2;

    public AnimatedTextView$AnimatedTextDrawable$$ExternalSyntheticLambda13(AnimatedTextView.AnimatedTextDrawable animatedTextDrawable, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = animatedTextDrawable;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setTextColor$9(this.f$1, this.f$2, valueAnimator);
                break;
            default:
                this.f$0.lambda$setEmojiColor$10(this.f$1, this.f$2, valueAnimator);
                break;
        }
    }
}
