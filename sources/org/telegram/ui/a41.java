package org.telegram.ui;

import android.animation.ValueAnimator;
public final class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34678a;
    public final d41 f34679b;

    public a41(d41 d41Var, int i10) {
        this.f34678a = i10;
        this.f34679b = d41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34678a) {
            case 0:
                d41 d41Var = this.f34679b;
                d41Var.getClass();
                d41Var.f35641e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.g();
                return;
            case 1:
                d41 d41Var2 = this.f34679b;
                d41Var2.getClass();
                d41Var2.f35641e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var2.g();
                return;
            default:
                d41 d41Var3 = this.f34679b;
                d41Var3.getClass();
                d41Var3.f35641e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var3.g();
                return;
        }
    }
}
