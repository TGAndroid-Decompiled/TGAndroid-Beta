package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qe0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38899a;
    public final se0 f38900b;

    public qe0(se0 se0Var, int i7) {
        this.f38899a = i7;
        this.f38900b = se0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38899a) {
            case 0:
                se0 se0Var = this.f38900b;
                se0Var.getClass();
                se0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var.invalidate();
                return;
            default:
                se0 se0Var2 = this.f38900b;
                se0Var2.getClass();
                se0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var2.invalidate();
                return;
        }
    }
}
