package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39391a;
    public final j2 f39392b;

    public h2(j2 j2Var, int i3) {
        this.f39391a = i3;
        this.f39392b = j2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39391a) {
            case 0:
                j2 j2Var = this.f39392b;
                j2Var.getClass();
                j2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var.invalidate();
                j2Var.U.c();
                return;
            case 1:
                j2 j2Var2 = this.f39392b;
                j2Var2.getClass();
                j2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var2.invalidate();
                j2Var2.U.c();
                return;
            case 2:
                j2 j2Var3 = this.f39392b;
                j2Var3.getClass();
                j2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var3.invalidate();
                j2Var3.U.c();
                return;
            case 3:
                j2 j2Var4 = this.f39392b;
                j2Var4.getClass();
                j2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var4.invalidate();
                return;
            case 4:
                j2 j2Var5 = this.f39392b;
                j2Var5.getClass();
                j2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var5.invalidate();
                return;
            default:
                j2 j2Var6 = this.f39392b;
                j2Var6.getClass();
                j2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var6.invalidate();
                return;
        }
    }
}
