package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39359a;
    public final l0 f39360b;

    public g0(l0 l0Var, int i3) {
        this.f39359a = i3;
        this.f39360b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39359a) {
            case 0:
                l0 l0Var = this.f39360b;
                l0Var.getClass();
                l0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            case 1:
                l0 l0Var2 = this.f39360b;
                l0Var2.getClass();
                l0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = l0Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = l0Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = l0Var2.E;
                l0Var2.H = L - (L * f10);
                l0Var2.I = L2 - (f10 * L2);
                l0Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var3 = this.f39360b;
                l0Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                j0 j0Var = l0Var3.f39447c;
                j0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * l0Var3.F));
                j0Var.requestLayout();
                return;
            default:
                l0 l0Var4 = this.f39360b;
                l0Var4.getClass();
                l0Var4.f39452s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var4.e();
                return;
        }
    }
}
