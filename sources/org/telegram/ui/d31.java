package org.telegram.ui;

import android.animation.ValueAnimator;
public final class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38510a;
    public final g31 f38511b;

    public d31(g31 g31Var, int i10) {
        this.f38510a = i10;
        this.f38511b = g31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38510a) {
            case 0:
                g31 g31Var = this.f38511b;
                g31Var.getClass();
                g31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var.g();
                return;
            case 1:
                g31 g31Var2 = this.f38511b;
                g31Var2.getClass();
                g31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var2.g();
                return;
            default:
                g31 g31Var3 = this.f38511b;
                g31Var3.getClass();
                g31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var3.g();
                return;
        }
    }
}
