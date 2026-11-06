package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39526a;
    public final z0 f39527b;

    public u0(z0 z0Var, int i7) {
        this.f39526a = i7;
        this.f39527b = z0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39526a) {
            case 0:
                z0 z0Var = this.f39527b;
                z0Var.getClass();
                z0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.invalidate();
                return;
            case 1:
                z0 z0Var2 = this.f39527b;
                z0Var2.getClass();
                z0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = z0Var2.I + org.telegram.messenger.g0.L(28.0f);
                float L2 = z0Var2.J + org.telegram.messenger.g0.L(52.0f);
                float f10 = z0Var2.D;
                z0Var2.G = L - (L * f10);
                z0Var2.H = L2 - (f10 * L2);
                z0Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0 z0Var3 = this.f39527b;
                z0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                x0 x0Var = z0Var3.f39633c;
                x0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * z0Var3.E));
                x0Var.requestLayout();
                return;
            default:
                z0 z0Var4 = this.f39527b;
                z0Var4.getClass();
                z0Var4.f39638s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var4.e();
                return;
        }
    }
}
