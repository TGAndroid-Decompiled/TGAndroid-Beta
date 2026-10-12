package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29704a;
    public final gl0 f29705b;

    public uk0(gl0 gl0Var, float f7) {
        this.f29705b = gl0Var;
        this.f29704a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gl0 gl0Var = this.f29705b;
        gl0Var.f25345o0 = floatValue;
        gl0Var.f25344n0 = (1.0f - gl0Var.f25345o0) * this.f29704a;
        gl0Var.invalidate();
    }
}
