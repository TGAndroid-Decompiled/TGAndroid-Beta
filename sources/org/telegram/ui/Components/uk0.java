package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f31178a;
    public final gl0 f31179b;

    public uk0(gl0 gl0Var, float f7) {
        this.f31179b = gl0Var;
        this.f31178a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gl0 gl0Var = this.f31179b;
        gl0Var.f26657o0 = floatValue;
        gl0Var.f26656n0 = (1.0f - gl0Var.f26657o0) * this.f31178a;
        gl0Var.invalidate();
    }
}
