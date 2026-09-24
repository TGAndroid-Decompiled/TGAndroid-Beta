package org.telegram.ui;

import android.animation.ValueAnimator;
public final class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31969a;
    public final d41 f31970b;

    public a41(d41 d41Var, int i10) {
        this.f31969a = i10;
        this.f31970b = d41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31969a) {
            case 0:
                d41 d41Var = this.f31970b;
                d41Var.getClass();
                d41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.g();
                return;
            case 1:
                d41 d41Var2 = this.f31970b;
                d41Var2.getClass();
                d41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var2.g();
                return;
            default:
                d41 d41Var3 = this.f31970b;
                d41Var3.getClass();
                d41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var3.g();
                return;
        }
    }
}
