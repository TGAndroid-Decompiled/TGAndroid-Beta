package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34374a;
    public final zv0 f34375b;

    public wv0(zv0 zv0Var, int i9) {
        this.f34374a = i9;
        this.f34375b = zv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34374a) {
            case 0:
                zv0 zv0Var = this.f34375b;
                zv0Var.getClass();
                zv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zv0Var.invalidate();
                return;
            case 1:
                zv0 zv0Var2 = this.f34375b;
                zv0Var2.getClass();
                zv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zv0 zv0Var3 = this.f34375b;
                zv0Var3.getClass();
                zv0Var3.f35382y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zv0Var3.invalidate();
                return;
        }
    }
}
