package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26881a;
    public final sk0 f26882b;

    public gk0(sk0 sk0Var, float f7) {
        this.f26882b = sk0Var;
        this.f26881a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.f26882b;
        sk0Var.f30783o0 = floatValue;
        sk0Var.f30782n0 = (1.0f - sk0Var.f30783o0) * this.f26881a;
        sk0Var.invalidate();
    }
}
