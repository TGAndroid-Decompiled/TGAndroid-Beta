package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39526a;
    public final u2 f39527b;

    public s2(u2 u2Var, int i7) {
        this.f39526a = i7;
        this.f39527b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39526a) {
            case 0:
                u2 u2Var = this.f39527b;
                u2Var.getClass();
                u2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.invalidate();
                u2Var.T.c();
                return;
            case 1:
                u2 u2Var2 = this.f39527b;
                u2Var2.getClass();
                u2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                u2Var2.T.c();
                return;
            case 2:
                u2 u2Var3 = this.f39527b;
                u2Var3.getClass();
                u2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var3.invalidate();
                u2Var3.T.c();
                return;
            case 3:
                u2 u2Var4 = this.f39527b;
                u2Var4.getClass();
                u2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var4.invalidate();
                return;
            case 4:
                u2 u2Var5 = this.f39527b;
                u2Var5.getClass();
                u2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var5.invalidate();
                return;
            default:
                u2 u2Var6 = this.f39527b;
                u2Var6.getClass();
                u2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var6.invalidate();
                return;
        }
    }
}
