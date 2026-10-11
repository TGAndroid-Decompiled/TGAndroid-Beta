package org.telegram.ui;

import android.animation.ValueAnimator;
public final class h41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38326a;
    public final k41 f38327b;

    public h41(k41 k41Var, int i10) {
        this.f38326a = i10;
        this.f38327b = k41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38326a) {
            case 0:
                k41 k41Var = this.f38327b;
                k41Var.getClass();
                k41Var.f39229e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k41Var.g();
                return;
            case 1:
                k41 k41Var2 = this.f38327b;
                k41Var2.getClass();
                k41Var2.f39229e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k41Var2.g();
                return;
            default:
                k41 k41Var3 = this.f38327b;
                k41Var3.getClass();
                k41Var3.f39229e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k41Var3.g();
                return;
        }
    }
}
