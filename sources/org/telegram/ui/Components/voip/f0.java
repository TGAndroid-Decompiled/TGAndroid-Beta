package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31414a;
    public final l0 f31415b;

    public f0(l0 l0Var, int i10) {
        this.f31414a = i10;
        this.f31415b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31414a) {
            case 0:
                l0 l0Var = this.f31415b;
                l0Var.getClass();
                l0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            case 1:
                l0 l0Var2 = this.f31415b;
                l0Var2.getClass();
                l0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = l0Var2.I + org.telegram.messenger.i0.L(28.0f);
                float L2 = l0Var2.J + org.telegram.messenger.i0.L(52.0f);
                float f7 = l0Var2.D;
                l0Var2.G = L - (L * f7);
                l0Var2.H = L2 - (f7 * L2);
                l0Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var3 = this.f31415b;
                l0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(36.0f)) - org.telegram.messenger.i0.L(52.0f);
                j0 j0Var = l0Var3.f31514c;
                j0Var.getLayoutParams().width = org.telegram.messenger.i0.L(52.0f) + ((int) (L3 * l0Var3.E));
                j0Var.requestLayout();
                return;
            default:
                l0 l0Var4 = this.f31415b;
                l0Var4.getClass();
                l0Var4.f31518s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var4.e();
                return;
        }
    }
}
