package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38187a;
    public final o41 f38188b;

    public l41(o41 o41Var, int i10) {
        this.f38187a = i10;
        this.f38188b = o41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38187a) {
            case 0:
                o41 o41Var = this.f38188b;
                o41Var.getClass();
                o41Var.f39104e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.g();
                return;
            case 1:
                o41 o41Var2 = this.f38188b;
                o41Var2.getClass();
                o41Var2.f39104e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var2.g();
                return;
            default:
                o41 o41Var3 = this.f38188b;
                o41Var3.getClass();
                o41Var3.f39104e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var3.g();
                return;
        }
    }
}
