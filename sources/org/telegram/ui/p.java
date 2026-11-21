package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f50690a;
    public final g4 f50691b;

    public p(g4 g4Var, int i7) {
        this.f50690a = i7;
        this.f50691b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50690a) {
            case 0:
                g4 g4Var = this.f50691b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.f50691b;
                g4Var2.f47947a1 = floatValue;
                g4Var2.f47965r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.f47964q0);
                return;
        }
    }
}
