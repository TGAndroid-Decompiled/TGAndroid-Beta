package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class su0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38155a;
    public final vu0 f38156b;

    public su0(vu0 vu0Var, int i7) {
        this.f38155a = i7;
        this.f38156b = vu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38155a) {
            case 0:
                vu0 vu0Var = this.f38156b;
                vu0Var.getClass();
                vu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.invalidate();
                return;
            case 1:
                vu0 vu0Var2 = this.f38156b;
                vu0Var2.getClass();
                vu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vu0 vu0Var3 = this.f38156b;
                vu0Var3.getClass();
                vu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var3.invalidate();
                return;
        }
    }
}
