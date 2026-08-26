package org.telegram.ui;

import android.animation.ValueAnimator;

public final class SelectAnimatedEmojiDialog$EmojiPackButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog.EmojiPackButton f$0;

    public SelectAnimatedEmojiDialog$EmojiPackButton$$ExternalSyntheticLambda0(SelectAnimatedEmojiDialog.EmojiPackButton emojiPackButton, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiPackButton;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateInstall$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$updateLock$1(valueAnimator);
                break;
        }
    }
}
