package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39411a;
    public final g31 f39412b;
    public final boolean f39413c;

    public m11(g31 g31Var, boolean z10, int i10) {
        this.f39411a = i10;
        this.f39412b = g31Var;
        this.f39413c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39411a) {
            case 0:
                g31 g31Var = this.f39412b;
                e21 e21Var = g31Var.f37305h0;
                t11 t11Var = g31Var.f37307i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39413c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                e21Var.setAlpha(f7);
                e21Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * floatValue);
                t11Var.setAlpha(floatValue);
                t11Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f7);
                g31Var.f37309j0.setAlpha(t11Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39413c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g31 g31Var2 = this.f39412b;
                g31Var2.f37309j0.setAlpha(g31Var2.f37307i0.getAlpha() * floatValue2);
                return;
        }
    }
}
