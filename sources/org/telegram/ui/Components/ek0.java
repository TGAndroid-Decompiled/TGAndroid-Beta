package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f23968a;
    public final qk0 f23969b;

    public ek0(qk0 qk0Var, float f7) {
        this.f23969b = qk0Var;
        this.f23968a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.f23969b;
        qk0Var.f27681o0 = floatValue;
        qk0Var.f27680n0 = (1.0f - qk0Var.f27681o0) * this.f23968a;
        qk0Var.invalidate();
    }
}
