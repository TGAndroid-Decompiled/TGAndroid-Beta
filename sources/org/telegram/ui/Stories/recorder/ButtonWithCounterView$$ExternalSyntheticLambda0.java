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
                ButtonWithCounterView buttonWithCounterView = this.f$0;
                buttonWithCounterView.getClass();
                buttonWithCounterView.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                buttonWithCounterView.invalidate();
                break;
            case 1:
                ButtonWithCounterView buttonWithCounterView2 = this.f$0;
                buttonWithCounterView2.getClass();
                buttonWithCounterView2.enabledT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonWithCounterView2.invalidate();
                break;
            case 2:
                ButtonWithCounterView buttonWithCounterView3 = this.f$0;
                buttonWithCounterView3.getClass();
                buttonWithCounterView3.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonWithCounterView3.invalidate();
                break;
            case 3:
                ButtonWithCounterView buttonWithCounterView4 = this.f$0;
                buttonWithCounterView4.getClass();
                buttonWithCounterView4.subTextT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonWithCounterView4.invalidate();
                break;
            default:
                ButtonWithCounterView buttonWithCounterView5 = this.f$0;
                buttonWithCounterView5.getClass();
                buttonWithCounterView5.subTextT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonWithCounterView5.invalidate();
                break;
        }
    }
}
