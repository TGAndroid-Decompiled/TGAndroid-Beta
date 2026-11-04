package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f48395a;
    public final i4 f48396b;

    public p(i4 i4Var, int i3) {
        this.f48395a = i3;
        this.f48396b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48395a) {
            case 0:
                i4 i4Var = this.f48396b;
                i4Var.getClass();
                i4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f48396b;
                i4Var2.f46078a1 = floatValue;
                i4Var2.f46096r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + i4Var2.f46095q0);
                return;
        }
    }
}
