package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31533a;
    public final k2 f31534b;

    public h2(k2 k2Var, int i10) {
        this.f31533a = i10;
        this.f31534b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31533a) {
            case 0:
                k2 k2Var = this.f31534b;
                k2Var.getClass();
                k2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var.invalidate();
                k2Var.T.c();
                return;
            case 1:
                k2 k2Var2 = this.f31534b;
                k2Var2.getClass();
                k2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var2.invalidate();
                k2Var2.T.c();
                return;
            case 2:
                k2 k2Var3 = this.f31534b;
                k2Var3.getClass();
                k2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var3.invalidate();
                k2Var3.T.c();
                return;
            case 3:
                k2 k2Var4 = this.f31534b;
                k2Var4.getClass();
                k2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var4.invalidate();
                return;
            case 4:
                k2 k2Var5 = this.f31534b;
                k2Var5.getClass();
                k2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var5.invalidate();
                return;
            default:
                k2 k2Var6 = this.f31534b;
                k2Var6.getClass();
                k2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var6.invalidate();
                return;
        }
    }
}
