package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ow0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26901a;
    public final rw0 f26902b;

    public ow0(rw0 rw0Var, int i10) {
        this.f26901a = i10;
        this.f26902b = rw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26901a) {
            case 0:
                rw0 rw0Var = this.f26902b;
                rw0Var.getClass();
                rw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var.invalidate();
                return;
            case 1:
                rw0 rw0Var2 = this.f26902b;
                rw0Var2.getClass();
                rw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rw0 rw0Var3 = this.f26902b;
                rw0Var3.getClass();
                rw0Var3.f27700y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var3.invalidate();
                return;
        }
    }
}
