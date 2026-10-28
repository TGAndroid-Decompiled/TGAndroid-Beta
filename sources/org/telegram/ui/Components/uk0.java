package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33422a;
    public final gl0 f33423b;

    public uk0(gl0 gl0Var, float f7) {
        this.f33423b = gl0Var;
        this.f33422a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gl0 gl0Var = this.f33423b;
        gl0Var.f28635o0 = floatValue;
        gl0Var.f28634n0 = (1.0f - gl0Var.f28635o0) * this.f33422a;
        gl0Var.invalidate();
    }
}
