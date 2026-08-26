package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;

public final class ButtonWithCounterView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ButtonWithCounterView f$0;

    public ButtonWithCounterView$$ExternalSyntheticLambda0(ButtonWithCounterView buttonWithCounterView, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWithCounterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$animateCount$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$setEnabled$5(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$setSubText$1(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$setSubText$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$setLoading$3(valueAnimator);
                break;
        }
    }
}
