package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26613a;
    public final qk0 f26614b;

    public ek0(qk0 qk0Var, float f10) {
        this.f26614b = qk0Var;
        this.f26613a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.f26614b;
        qk0Var.f30446l0 = floatValue;
        qk0Var.f30445k0 = (1.0f - qk0Var.f30446l0) * this.f26613a;
        qk0Var.invalidate();
    }
}
