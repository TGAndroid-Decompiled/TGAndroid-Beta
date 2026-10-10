package org.telegram.ui;

import android.animation.ValueAnimator;
public final class i41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38569a;
    public final l41 f38570b;

    public i41(l41 l41Var, int i10) {
        this.f38569a = i10;
        this.f38570b = l41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38569a) {
            case 0:
                l41 l41Var = this.f38570b;
                l41Var.getClass();
                l41Var.f39472e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.g();
                return;
            case 1:
                l41 l41Var2 = this.f38570b;
                l41Var2.getClass();
                l41Var2.f39472e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var2.g();
                return;
            default:
                l41 l41Var3 = this.f38570b;
                l41Var3.getClass();
                l41Var3.f39472e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var3.g();
                return;
        }
    }
}
