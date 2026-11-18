package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f50652a;
    public final g4 f50653b;

    public p(g4 g4Var, int i7) {
        this.f50652a = i7;
        this.f50653b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50652a) {
            case 0:
                g4 g4Var = this.f50653b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.f50653b;
                g4Var2.f47877a1 = floatValue;
                g4Var2.f47895r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.f47894q0);
                return;
        }
    }
}
