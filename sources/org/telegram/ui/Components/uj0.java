package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f28515a;
    public final gk0 f28516b;

    public uj0(gk0 gk0Var, float f7) {
        this.f28516b = gk0Var;
        this.f28515a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gk0 gk0Var = this.f28516b;
        gk0Var.f24346o0 = floatValue;
        gk0Var.f24345n0 = (1.0f - gk0Var.f24346o0) * this.f28515a;
        gk0Var.invalidate();
    }
}
