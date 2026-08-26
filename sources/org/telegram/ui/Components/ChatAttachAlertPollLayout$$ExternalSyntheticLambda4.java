package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlertPollLayout f$0;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda4(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPollLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hideEmojiPopup$11(valueAnimator);
                break;
            default:
                this.f$0.lambda$showEmojiPopup$10(valueAnimator);
                break;
        }
    }
}
