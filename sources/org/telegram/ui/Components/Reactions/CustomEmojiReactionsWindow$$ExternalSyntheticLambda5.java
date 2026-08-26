package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;

public final class CustomEmojiReactionsWindow$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CustomEmojiReactionsWindow f$0;

    public CustomEmojiReactionsWindow$$ExternalSyntheticLambda5(CustomEmojiReactionsWindow customEmojiReactionsWindow, int i) {
        this.$r8$classId = i;
        this.f$0 = customEmojiReactionsWindow;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = this.f$0;
                customEmojiReactionsWindow.getClass();
                customEmojiReactionsWindow.containerView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f$0.containerView.invalidate();
                break;
        }
    }
}
