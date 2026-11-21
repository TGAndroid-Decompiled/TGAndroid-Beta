package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41410a;
    public final x2 f41411b;

    public v2(x2 x2Var, int i7) {
        this.f41410a = i7;
        this.f41411b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41410a) {
            case 0:
                x2 x2Var = this.f41411b;
                x2Var.getClass();
                x2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.invalidate();
                x2Var.U.c();
                return;
            case 1:
                x2 x2Var2 = this.f41411b;
                x2Var2.getClass();
                x2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.invalidate();
                x2Var2.U.c();
                return;
            case 2:
                x2 x2Var3 = this.f41411b;
                x2Var3.getClass();
                x2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var3.invalidate();
                x2Var3.U.c();
                return;
            case 3:
                x2 x2Var4 = this.f41411b;
                x2Var4.getClass();
                x2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var4.invalidate();
                return;
            case 4:
                x2 x2Var5 = this.f41411b;
                x2Var5.getClass();
                x2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var5.invalidate();
                return;
            default:
                x2 x2Var6 = this.f41411b;
                x2Var6.getClass();
                x2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var6.invalidate();
                return;
        }
    }
}
