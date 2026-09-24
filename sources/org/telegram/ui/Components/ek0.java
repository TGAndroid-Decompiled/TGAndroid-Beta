package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f23951a;
    public final qk0 f23952b;

    public ek0(qk0 qk0Var, float f7) {
        this.f23952b = qk0Var;
        this.f23951a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.f23952b;
        qk0Var.f27674o0 = floatValue;
        qk0Var.f27673n0 = (1.0f - qk0Var.f27674o0) * this.f23951a;
        qk0Var.invalidate();
    }
}
