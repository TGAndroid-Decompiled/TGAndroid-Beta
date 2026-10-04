package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26880a;
    public final sk0 f26881b;

    public gk0(sk0 sk0Var, float f7) {
        this.f26881b = sk0Var;
        this.f26880a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.f26881b;
        sk0Var.f30782o0 = floatValue;
        sk0Var.f30781n0 = (1.0f - sk0Var.f30782o0) * this.f26880a;
        sk0Var.invalidate();
    }
}
