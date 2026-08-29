package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33656a;
    public final e3 f33657b;

    public c3(e3 e3Var, int i10) {
        this.f33656a = i10;
        this.f33657b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33656a) {
            case 0:
                e3 e3Var = this.f33657b;
                e3Var.getClass();
                e3Var.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.invalidate();
                e3Var.P.c();
                return;
            case 1:
                e3 e3Var2 = this.f33657b;
                e3Var2.getClass();
                e3Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.invalidate();
                e3Var2.P.c();
                return;
            case 2:
                e3 e3Var3 = this.f33657b;
                e3Var3.getClass();
                e3Var3.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var3.invalidate();
                e3Var3.P.c();
                return;
            case 3:
                e3 e3Var4 = this.f33657b;
                e3Var4.getClass();
                e3Var4.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var4.invalidate();
                return;
            case 4:
                e3 e3Var5 = this.f33657b;
                e3Var5.getClass();
                e3Var5.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var5.invalidate();
                return;
            default:
                e3 e3Var6 = this.f33657b;
                e3Var6.getClass();
                e3Var6.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var6.invalidate();
                return;
        }
    }
}
