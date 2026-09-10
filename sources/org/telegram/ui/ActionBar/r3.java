package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18613a;
    public final z3 f18614b;

    public r3(z3 z3Var, int i10) {
        this.f18613a = i10;
        this.f18614b = z3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18613a) {
            case 0:
                z3 z3Var = this.f18614b;
                z3Var.getClass();
                z3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                return;
            case 1:
                z3 z3Var2 = this.f18614b;
                z3Var2.getClass();
                z3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.invalidate();
                return;
            default:
                z3 z3Var3 = this.f18614b;
                z3Var3.getClass();
                z3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
