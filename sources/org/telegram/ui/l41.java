package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38186a;
    public final o41 f38187b;

    public l41(o41 o41Var, int i10) {
        this.f38186a = i10;
        this.f38187b = o41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38186a) {
            case 0:
                o41 o41Var = this.f38187b;
                o41Var.getClass();
                o41Var.f39103e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.g();
                return;
            case 1:
                o41 o41Var2 = this.f38187b;
                o41Var2.getClass();
                o41Var2.f39103e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var2.g();
                return;
            default:
                o41 o41Var3 = this.f38187b;
                o41Var3.getClass();
                o41Var3.f39103e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var3.g();
                return;
        }
    }
}
