package org.telegram.ui;

import android.animation.ValueAnimator;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37295a;
    public final l61 f37296b;

    public i61(l61 l61Var, int i10) {
        this.f37295a = i10;
        this.f37296b = l61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37295a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var = this.f37296b;
                l61Var.N = floatValue;
                l61Var.V.f35320h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var2 = this.f37296b;
                l61Var2.N = floatValue2;
                l61Var2.V.f35320h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var3 = this.f37296b;
                l61Var3.N = floatValue3;
                l61Var3.V.f35320h0.invalidate();
                return;
        }
    }
}
