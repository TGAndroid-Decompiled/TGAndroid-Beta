package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlert$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda8(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updatedTopCaptionHeight();
                break;
            case 1:
                this.f$0.updatedTopCaptionHeight();
                break;
            case 2:
                this.f$0.frameLayout2.invalidate();
                break;
            case 3:
                this.f$0.lambda$onCustomOpenAnimation$57(valueAnimator);
                break;
            default:
                this.f$0.lambda$onCustomOpenAnimation$60(valueAnimator);
                break;
        }
    }
}
