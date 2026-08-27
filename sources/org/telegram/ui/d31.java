package org.telegram.ui;

import android.animation.ValueAnimator;

public final class d31 implements ValueAnimator.AnimatorUpdateListener {

    public final int f37248a;

    public final g31 f37249b;

    public d31(g31 g31Var, int i10) {
        this.f37248a = i10;
        this.f37249b = g31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37248a) {
            case 0:
                g31 g31Var = this.f37249b;
                g31Var.getClass();
                g31Var.f38299e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var.g();
                break;
            case 1:
                g31 g31Var2 = this.f37249b;
                g31Var2.getClass();
                g31Var2.f38299e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var2.g();
                break;
            default:
                g31 g31Var3 = this.f37249b;
                g31Var3.getClass();
                g31Var3.f38299e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var3.g();
                break;
        }
    }
}
