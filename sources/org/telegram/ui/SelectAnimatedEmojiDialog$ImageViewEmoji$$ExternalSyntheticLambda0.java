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
                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = this.f$0;
                imageViewEmoji.getClass();
                imageViewEmoji.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imageViewEmoji.this$0.emojiGridView.invalidate();
                break;
            case 1:
                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji2 = this.f$0;
                imageViewEmoji2.getClass();
                imageViewEmoji2.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imageViewEmoji2.this$0.emojiGridView.invalidate();
                break;
            default:
                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji3 = this.f$0;
                imageViewEmoji3.getClass();
                imageViewEmoji3.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imageViewEmoji3.this$0.emojiGridView.invalidate();
                break;
        }
    }
}
