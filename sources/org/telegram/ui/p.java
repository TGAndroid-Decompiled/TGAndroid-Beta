package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f48573a;
    public final g4 f48574b;

    public p(g4 g4Var, int i7) {
        this.f48573a = i7;
        this.f48574b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48573a) {
            case 0:
                g4 g4Var = this.f48574b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.f48574b;
                g4Var2.Z0 = floatValue;
                g4Var2.f45815q0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.f45814p0);
                return;
        }
    }
}
