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
                PollCreateActivity pollCreateActivity = this.f$0;
                pollCreateActivity.getClass();
                pollCreateActivity.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                PollCreateActivity pollCreateActivity2 = this.f$0;
                pollCreateActivity2.getClass();
                pollCreateActivity2.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
