package org.telegram.ui;

import android.animation.ValueAnimator;
public final class on implements ValueAnimator.AnimatorUpdateListener {
    public final int f42251a;
    public final org.telegram.ui.Components.uc0 f42252b;

    public on(org.telegram.ui.Components.uc0 uc0Var, int i10) {
        this.f42251a = i10;
        this.f42252b = uc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42251a) {
            case 0:
                this.f42252b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42252b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f42252b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
