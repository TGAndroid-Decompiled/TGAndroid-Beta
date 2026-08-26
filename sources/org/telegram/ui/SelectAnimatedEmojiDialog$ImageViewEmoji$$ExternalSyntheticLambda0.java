package org.telegram.ui;

import android.animation.ValueAnimator;

public final class SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog.ImageViewEmoji f$0;

    public SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, int i) {
        this.$r8$classId = i;
        this.f$0 = imageViewEmoji;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setPressed$1(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$unselectWithScale$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$setViewSelectedWithScale$3(valueAnimator);
                break;
        }
    }
}
