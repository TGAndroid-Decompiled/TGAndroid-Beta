package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41341a;
    public final d1 f41342b;

    public y0(d1 d1Var, int i7) {
        this.f41341a = i7;
        this.f41342b = d1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41341a) {
            case 0:
                d1 d1Var = this.f41342b;
                d1Var.getClass();
                d1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                d1 d1Var2 = this.f41342b;
                d1Var2.getClass();
                d1Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = d1Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = d1Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = d1Var2.E;
                d1Var2.H = L - (L * f10);
                d1Var2.I = L2 - (f10 * L2);
                d1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1 d1Var3 = this.f41342b;
                d1Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                b1 b1Var = d1Var3.f40819c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * d1Var3.F));
                b1Var.requestLayout();
                return;
            default:
                d1 d1Var4 = this.f41342b;
                d1Var4.getClass();
                d1Var4.f40824s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var4.e();
                return;
        }
    }
}
