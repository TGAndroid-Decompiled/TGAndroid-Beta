package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34152a;
    public final fv0 f34153b;

    public cv0(fv0 fv0Var, int i7) {
        this.f34152a = i7;
        this.f34153b = fv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34152a) {
            case 0:
                fv0 fv0Var = this.f34153b;
                fv0Var.getClass();
                fv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 1:
                fv0 fv0Var2 = this.f34153b;
                fv0Var2.getClass();
                fv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fv0 fv0Var3 = this.f34153b;
                fv0Var3.getClass();
                fv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var3.invalidate();
                return;
        }
    }
}
