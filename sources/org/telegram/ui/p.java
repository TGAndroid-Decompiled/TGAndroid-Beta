package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f50670a;
    public final g4 f50671b;

    public p(g4 g4Var, int i7) {
        this.f50670a = i7;
        this.f50671b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50670a) {
            case 0:
                g4 g4Var = this.f50671b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.f50671b;
                g4Var2.f47898a1 = floatValue;
                g4Var2.f47916r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.f47915q0);
                return;
        }
    }
}
