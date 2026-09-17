package org.telegram.ui;

import android.animation.ValueAnimator;
public final class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34988a;
    public final n41 f34989b;

    public k41(n41 n41Var, int i10) {
        this.f34988a = i10;
        this.f34989b = n41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34988a) {
            case 0:
                n41 n41Var = this.f34989b;
                n41Var.getClass();
                n41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.g();
                return;
            case 1:
                n41 n41Var2 = this.f34989b;
                n41Var2.getClass();
                n41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var2.g();
                return;
            default:
                n41 n41Var3 = this.f34989b;
                n41Var3.getClass();
                n41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var3.g();
                return;
        }
    }
}
