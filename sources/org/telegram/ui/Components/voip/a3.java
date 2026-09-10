package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28053a;
    public final c3 f28054b;

    public a3(c3 c3Var, int i10) {
        this.f28053a = i10;
        this.f28054b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28053a) {
            case 0:
                c3 c3Var = this.f28054b;
                c3Var.getClass();
                c3Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var.invalidate();
                c3Var.T.c();
                return;
            case 1:
                c3 c3Var2 = this.f28054b;
                c3Var2.getClass();
                c3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var2.invalidate();
                c3Var2.T.c();
                return;
            case 2:
                c3 c3Var3 = this.f28054b;
                c3Var3.getClass();
                c3Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var3.invalidate();
                c3Var3.T.c();
                return;
            case 3:
                c3 c3Var4 = this.f28054b;
                c3Var4.getClass();
                c3Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var4.invalidate();
                return;
            case 4:
                c3 c3Var5 = this.f28054b;
                c3Var5.getClass();
                c3Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var5.invalidate();
                return;
            default:
                c3 c3Var6 = this.f28054b;
                c3Var6.getClass();
                c3Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var6.invalidate();
                return;
        }
    }
}
