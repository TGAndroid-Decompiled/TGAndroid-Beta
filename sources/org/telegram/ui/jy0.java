package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46711a;
    public final my0 f46712b;

    public jy0(my0 my0Var, int i3) {
        this.f46711a = i3;
        this.f46712b = my0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46711a) {
            case 0:
                my0 my0Var = this.f46712b;
                my0Var.getClass();
                my0Var.f47828e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var.g();
                return;
            case 1:
                my0 my0Var2 = this.f46712b;
                my0Var2.getClass();
                my0Var2.f47828e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var2.g();
                return;
            default:
                my0 my0Var3 = this.f46712b;
                my0Var3.getClass();
                my0Var3.f47828e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var3.g();
                return;
        }
    }
}
