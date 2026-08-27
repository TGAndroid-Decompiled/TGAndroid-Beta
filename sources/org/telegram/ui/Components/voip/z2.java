package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class z2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f34019a;

    public final b3 f34020b;

    public z2(b3 b3Var, int i10) {
        this.f34019a = i10;
        this.f34020b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34019a) {
            case 0:
                b3 b3Var = this.f34020b;
                b3Var.getClass();
                b3Var.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var.invalidate();
                b3Var.P.c();
                break;
            case 1:
                b3 b3Var2 = this.f34020b;
                b3Var2.getClass();
                b3Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.invalidate();
                b3Var2.P.c();
                break;
            case 2:
                b3 b3Var3 = this.f34020b;
                b3Var3.getClass();
                b3Var3.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var3.invalidate();
                b3Var3.P.c();
                break;
            case 3:
                b3 b3Var4 = this.f34020b;
                b3Var4.getClass();
                b3Var4.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var4.invalidate();
                break;
            case 4:
                b3 b3Var5 = this.f34020b;
                b3Var5.getClass();
                b3Var5.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var5.invalidate();
                break;
            default:
                b3 b3Var6 = this.f34020b;
                b3Var6.getClass();
                b3Var6.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var6.invalidate();
                break;
        }
    }
}
