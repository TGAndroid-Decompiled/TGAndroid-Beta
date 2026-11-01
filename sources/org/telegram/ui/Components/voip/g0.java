package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31504a;
    public final m0 f31505b;

    public g0(m0 m0Var, int i10) {
        this.f31504a = i10;
        this.f31505b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31504a) {
            case 0:
                m0 m0Var = this.f31505b;
                m0Var.getClass();
                m0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            case 1:
                m0 m0Var2 = this.f31505b;
                m0Var2.getClass();
                m0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = m0Var2.I + org.telegram.messenger.i0.L(28.0f);
                float L2 = m0Var2.J + org.telegram.messenger.i0.L(52.0f);
                float f7 = m0Var2.D;
                m0Var2.G = L - (L * f7);
                m0Var2.H = L2 - (f7 * L2);
                m0Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var3 = this.f31505b;
                m0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(36.0f)) - org.telegram.messenger.i0.L(52.0f);
                k0 k0Var = m0Var3.f31593c;
                k0Var.getLayoutParams().width = org.telegram.messenger.i0.L(52.0f) + ((int) (L3 * m0Var3.E));
                k0Var.requestLayout();
                return;
            default:
                m0 m0Var4 = this.f31505b;
                m0Var4.getClass();
                m0Var4.f31597s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var4.e();
                return;
        }
    }
}
