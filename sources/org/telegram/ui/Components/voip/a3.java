package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40872a;
    public final d3 f40873b;

    public a3(d3 d3Var, int i7) {
        this.f40872a = i7;
        this.f40873b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40872a) {
            case 0:
                d3 d3Var = this.f40873b;
                d3Var.getClass();
                d3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.invalidate();
                return;
            case 1:
                d3 d3Var2 = this.f40873b;
                d3Var2.getClass();
                d3Var2.f40932x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var2.invalidate();
                return;
            case 2:
                d3 d3Var3 = this.f40873b;
                d3Var3.getClass();
                d3Var3.f40930s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var3.invalidate();
                return;
            default:
                d3 d3Var4 = this.f40873b;
                d3Var4.getClass();
                d3Var4.f40929r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var4.invalidate();
                return;
        }
    }
}
