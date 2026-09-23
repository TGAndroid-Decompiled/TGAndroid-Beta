package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27933a;
    public final vg0 f27934b;

    public sg0(vg0 vg0Var, int i10) {
        this.f27933a = i10;
        this.f27934b = vg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27933a) {
            case 0:
                vg0 vg0Var = this.f27934b;
                vg0Var.getClass();
                vg0Var.f28740b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.c(true);
                return;
            default:
                vg0 vg0Var2 = this.f27934b;
                vg0Var2.getClass();
                vg0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.c(true);
                return;
        }
    }
}
