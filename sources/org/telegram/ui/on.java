package org.telegram.ui;

import android.animation.ValueAnimator;
public final class on implements ValueAnimator.AnimatorUpdateListener {
    public final int f42248a;
    public final org.telegram.ui.Components.uc0 f42249b;

    public on(org.telegram.ui.Components.uc0 uc0Var, int i10) {
        this.f42248a = i10;
        this.f42249b = uc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42248a) {
            case 0:
                this.f42249b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42249b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42249b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
