package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlertPollLayout f$0;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda2(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPollLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.f$0;
                chatAttachAlertPollLayout.getClass();
                chatAttachAlertPollLayout.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.f$0;
                chatAttachAlertPollLayout2.getClass();
                chatAttachAlertPollLayout2.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
