package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34582a;
    public final gv0 f34583b;

    public dv0(gv0 gv0Var, int i7) {
        this.f34582a = i7;
        this.f34583b = gv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34582a) {
            case 0:
                gv0 gv0Var = this.f34583b;
                gv0Var.getClass();
                gv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                return;
            case 1:
                gv0 gv0Var2 = this.f34583b;
                gv0Var2.getClass();
                gv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                gv0 gv0Var3 = this.f34583b;
                gv0Var3.getClass();
                gv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var3.invalidate();
                return;
        }
    }
}
