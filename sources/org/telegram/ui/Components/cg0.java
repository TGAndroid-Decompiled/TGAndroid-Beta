package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23267a;
    public final eg0 f23268b;

    public cg0(eg0 eg0Var, int i10) {
        this.f23267a = i10;
        this.f23268b = eg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23267a) {
            case 0:
                eg0 eg0Var = this.f23268b;
                eg0Var.getClass();
                eg0Var.f23878y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.invalidate();
                return;
            default:
                eg0 eg0Var2 = this.f23268b;
                eg0Var2.getClass();
                eg0Var2.f23878y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var2.invalidate();
                return;
        }
    }
}
