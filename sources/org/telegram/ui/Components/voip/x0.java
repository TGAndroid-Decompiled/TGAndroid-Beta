package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41445a;
    public final c1 f41446b;

    public x0(c1 c1Var, int i7) {
        this.f41445a = i7;
        this.f41446b = c1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41445a) {
            case 0:
                c1 c1Var = this.f41446b;
                c1Var.getClass();
                c1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 1:
                c1 c1Var2 = this.f41446b;
                c1Var2.getClass();
                c1Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = c1Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = c1Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = c1Var2.E;
                c1Var2.H = L - (L * f10);
                c1Var2.I = L2 - (f10 * L2);
                c1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1 c1Var3 = this.f41446b;
                c1Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                a1 a1Var = c1Var3.f40926c;
                a1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * c1Var3.F));
                a1Var.requestLayout();
                return;
            default:
                c1 c1Var4 = this.f41446b;
                c1Var4.getClass();
                c1Var4.f40931s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var4.e();
                return;
        }
    }
}
