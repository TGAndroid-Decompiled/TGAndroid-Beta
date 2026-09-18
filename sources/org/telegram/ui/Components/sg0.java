package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27862a;
    public final vg0 f27863b;

    public sg0(vg0 vg0Var, int i10) {
        this.f27862a = i10;
        this.f27863b = vg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27862a) {
            case 0:
                vg0 vg0Var = this.f27863b;
                vg0Var.getClass();
                vg0Var.f28715b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.c(true);
                return;
            default:
                vg0 vg0Var2 = this.f27863b;
                vg0Var2.getClass();
                vg0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.c(true);
                return;
        }
    }
}
