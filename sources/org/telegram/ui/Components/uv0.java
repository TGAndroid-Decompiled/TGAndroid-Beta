package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31097a;
    public final xv0 f31098b;

    public uv0(xv0 xv0Var, int i10) {
        this.f31097a = i10;
        this.f31098b = xv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31097a) {
            case 0:
                xv0 xv0Var = this.f31098b;
                xv0Var.getClass();
                xv0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv0Var.invalidate();
                return;
            case 1:
                xv0 xv0Var2 = this.f31098b;
                xv0Var2.getClass();
                xv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xv0 xv0Var3 = this.f31098b;
                xv0Var3.getClass();
                xv0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv0Var3.invalidate();
                return;
        }
    }
}
