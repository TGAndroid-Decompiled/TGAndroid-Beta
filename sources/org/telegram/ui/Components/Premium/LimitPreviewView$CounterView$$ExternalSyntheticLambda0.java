package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;

public final class LimitPreviewView$CounterView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LimitPreviewView.CounterView f$0;
    public final LimitPreviewView.CounterView.AnimatedLayout f$1;

    public LimitPreviewView$CounterView$$ExternalSyntheticLambda0(LimitPreviewView.CounterView counterView, LimitPreviewView.CounterView.AnimatedLayout animatedLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = counterView;
        this.f$1 = animatedLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                LimitPreviewView.CounterView counterView = this.f$0;
                counterView.getClass();
                this.f$1.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                counterView.invalidate();
                break;
            default:
                LimitPreviewView.CounterView counterView2 = this.f$0;
                counterView2.getClass();
                this.f$1.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                counterView2.invalidate();
                break;
        }
    }
}
