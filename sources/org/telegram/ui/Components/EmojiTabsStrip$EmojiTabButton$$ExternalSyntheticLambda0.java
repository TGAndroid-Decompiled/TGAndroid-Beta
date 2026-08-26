package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class EmojiTabsStrip$EmojiTabButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final EmojiTabsStrip.EmojiTabButton f$0;

    public EmojiTabsStrip$EmojiTabButton$$ExternalSyntheticLambda0(EmojiTabsStrip.EmojiTabButton emojiTabButton, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiTabButton;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateSelect$1(valueAnimator);
                break;
            default:
                this.f$0.lambda$updateLock$0(valueAnimator);
                break;
        }
    }
}
