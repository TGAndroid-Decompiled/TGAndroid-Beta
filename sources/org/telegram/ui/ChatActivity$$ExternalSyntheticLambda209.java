package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ChatActivity$$ExternalSyntheticLambda209 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda209(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hideFloatingTopicView$130(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$updateBottomOverlay$221(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$updateBottomOverlay$222(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$showFloatingTopicView$129(valueAnimator);
                break;
            default:
                this.f$0.lambda$closeMenu$309(valueAnimator);
                break;
        }
    }
}
