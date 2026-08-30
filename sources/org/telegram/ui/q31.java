package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37583a;
    public final t31 f37584b;

    public q31(t31 t31Var, int i10) {
        this.f37583a = i10;
        this.f37584b = t31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37583a) {
            case 0:
                t31 t31Var = this.f37584b;
                t31Var.getClass();
                t31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var.g();
                return;
            case 1:
                t31 t31Var2 = this.f37584b;
                t31Var2.getClass();
                t31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var2.g();
                return;
            default:
                t31 t31Var3 = this.f37584b;
                t31Var3.getClass();
                t31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var3.g();
                return;
        }
    }
}
