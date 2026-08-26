package org.telegram.ui;

import android.animation.ValueAnimator;

public final class PollCreateActivity$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PollCreateActivity f$0;

    public PollCreateActivity$$ExternalSyntheticLambda0(PollCreateActivity pollCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = pollCreateActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showEmojiPopup$4(valueAnimator);
                break;
            default:
                this.f$0.lambda$hideEmojiPopup$5(valueAnimator);
                break;
        }
    }
}
