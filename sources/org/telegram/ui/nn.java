package org.telegram.ui;

import android.animation.ValueAnimator;
public final class nn implements ValueAnimator.AnimatorUpdateListener {
    public final int f40849a;
    public final org.telegram.ui.Components.yb0 f40850b;

    public nn(org.telegram.ui.Components.yb0 yb0Var, int i10) {
        this.f40849a = i10;
        this.f40850b = yb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40849a) {
            case 0:
                this.f40850b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40850b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f40850b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
