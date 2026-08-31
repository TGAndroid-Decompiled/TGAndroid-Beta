package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31979a;
    public final d3 f31980b;

    public b3(d3 d3Var, int i10) {
        this.f31979a = i10;
        this.f31980b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31979a) {
            case 0:
                d3 d3Var = this.f31980b;
                d3Var.getClass();
                d3Var.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var.invalidate();
                d3Var.Q.c();
                return;
            case 1:
                d3 d3Var2 = this.f31980b;
                d3Var2.getClass();
                d3Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var2.invalidate();
                d3Var2.Q.c();
                return;
            case 2:
                d3 d3Var3 = this.f31980b;
                d3Var3.getClass();
                d3Var3.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var3.invalidate();
                d3Var3.Q.c();
                return;
            case 3:
                d3 d3Var4 = this.f31980b;
                d3Var4.getClass();
                d3Var4.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var4.invalidate();
                return;
            case 4:
                d3 d3Var5 = this.f31980b;
                d3Var5.getClass();
                d3Var5.C = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var5.invalidate();
                return;
            default:
                d3 d3Var6 = this.f31980b;
                d3Var6.getClass();
                d3Var6.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var6.invalidate();
                return;
        }
    }
}
