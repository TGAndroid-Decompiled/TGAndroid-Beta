package org.telegram.ui;

import android.animation.ValueAnimator;
public final class b31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37966a;
    public final e31 f37967b;

    public b31(e31 e31Var, int i10) {
        this.f37966a = i10;
        this.f37967b = e31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37966a) {
            case 0:
                e31 e31Var = this.f37967b;
                e31Var.getClass();
                e31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.g();
                return;
            case 1:
                e31 e31Var2 = this.f37967b;
                e31Var2.getClass();
                e31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var2.g();
                return;
            default:
                e31 e31Var3 = this.f37967b;
                e31Var3.getClass();
                e31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var3.g();
                return;
        }
    }
}
