package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class eg0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f28052a;

    public final hg0 f28053b;

    public eg0(hg0 hg0Var, int i10) {
        this.f28052a = i10;
        this.f28053b = hg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28052a) {
            case 0:
                hg0 hg0Var = this.f28053b;
                hg0Var.getClass();
                hg0Var.f29007b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.c(true);
                break;
            default:
                hg0 hg0Var2 = this.f28053b;
                hg0Var2.getClass();
                hg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.c(true);
                break;
        }
    }
}
