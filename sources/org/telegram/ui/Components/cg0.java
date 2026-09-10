package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22125a;
    public final eg0 f22126b;

    public cg0(eg0 eg0Var, int i10) {
        this.f22125a = i10;
        this.f22126b = eg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22125a) {
            case 0:
                eg0 eg0Var = this.f22126b;
                eg0Var.getClass();
                eg0Var.f22701y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.invalidate();
                return;
            default:
                eg0 eg0Var2 = this.f22126b;
                eg0Var2.getClass();
                eg0Var2.f22701y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var2.invalidate();
                return;
        }
    }
}
