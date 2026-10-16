package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30286a;
    public final b3 f30287b;

    public z2(b3 b3Var, int i10) {
        this.f30286a = i10;
        this.f30287b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30286a) {
            case 0:
                b3 b3Var = this.f30287b;
                b3Var.getClass();
                b3Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var.invalidate();
                b3Var.T.c();
                return;
            case 1:
                b3 b3Var2 = this.f30287b;
                b3Var2.getClass();
                b3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.invalidate();
                b3Var2.T.c();
                return;
            case 2:
                b3 b3Var3 = this.f30287b;
                b3Var3.getClass();
                b3Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var3.invalidate();
                b3Var3.T.c();
                return;
            case 3:
                b3 b3Var4 = this.f30287b;
                b3Var4.getClass();
                b3Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var4.invalidate();
                return;
            case 4:
                b3 b3Var5 = this.f30287b;
                b3Var5.getClass();
                b3Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var5.invalidate();
                return;
            default:
                b3 b3Var6 = this.f30287b;
                b3Var6.getClass();
                b3Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var6.invalidate();
                return;
        }
    }
}
