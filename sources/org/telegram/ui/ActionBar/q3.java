package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19528a;
    public final y3 f19529b;

    public q3(y3 y3Var, int i10) {
        this.f19528a = i10;
        this.f19529b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19528a) {
            case 0:
                y3 y3Var = this.f19529b;
                y3Var.getClass();
                y3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.invalidate();
                return;
            case 1:
                y3 y3Var2 = this.f19529b;
                y3Var2.getClass();
                y3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.invalidate();
                return;
            default:
                y3 y3Var3 = this.f19529b;
                y3Var3.getClass();
                y3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
