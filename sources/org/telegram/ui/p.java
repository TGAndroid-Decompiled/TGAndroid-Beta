package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f50696a;
    public final g4 f50697b;

    public p(g4 g4Var, int i7) {
        this.f50696a = i7;
        this.f50697b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50696a) {
            case 0:
                g4 g4Var = this.f50697b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.f50697b;
                g4Var2.f47913a1 = floatValue;
                g4Var2.f47931r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.f47930q0);
                return;
        }
    }
}
