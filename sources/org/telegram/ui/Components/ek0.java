package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f23893a;
    public final qk0 f23894b;

    public ek0(qk0 qk0Var, float f7) {
        this.f23894b = qk0Var;
        this.f23893a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.f23894b;
        qk0Var.f27662o0 = floatValue;
        qk0Var.f27661n0 = (1.0f - qk0Var.f27662o0) * this.f23893a;
        qk0Var.invalidate();
    }
}
