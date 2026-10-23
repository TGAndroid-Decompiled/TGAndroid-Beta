package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21811a;
    public final z3 f21812b;

    public r3(z3 z3Var, int i10) {
        this.f21811a = i10;
        this.f21812b = z3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21811a) {
            case 0:
                z3 z3Var = this.f21812b;
                z3Var.getClass();
                z3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                return;
            case 1:
                z3 z3Var2 = this.f21812b;
                z3Var2.getClass();
                z3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.invalidate();
                return;
            default:
                z3 z3Var3 = this.f21812b;
                z3Var3.getClass();
                z3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
