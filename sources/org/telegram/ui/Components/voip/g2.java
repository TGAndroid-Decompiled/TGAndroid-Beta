package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31454a;
    public final j2 f31455b;

    public g2(j2 j2Var, int i10) {
        this.f31454a = i10;
        this.f31455b = j2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31454a) {
            case 0:
                j2 j2Var = this.f31455b;
                j2Var.getClass();
                j2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var.invalidate();
                j2Var.T.c();
                return;
            case 1:
                j2 j2Var2 = this.f31455b;
                j2Var2.getClass();
                j2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var2.invalidate();
                j2Var2.T.c();
                return;
            case 2:
                j2 j2Var3 = this.f31455b;
                j2Var3.getClass();
                j2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var3.invalidate();
                j2Var3.T.c();
                return;
            case 3:
                j2 j2Var4 = this.f31455b;
                j2Var4.getClass();
                j2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var4.invalidate();
                return;
            case 4:
                j2 j2Var5 = this.f31455b;
                j2Var5.getClass();
                j2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var5.invalidate();
                return;
            default:
                j2 j2Var6 = this.f31455b;
                j2Var6.getClass();
                j2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var6.invalidate();
                return;
        }
    }
}
