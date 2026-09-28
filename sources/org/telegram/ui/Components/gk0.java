package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24565a;
    public final sk0 f24566b;

    public gk0(sk0 sk0Var, float f7) {
        this.f24566b = sk0Var;
        this.f24565a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.f24566b;
        sk0Var.f28293o0 = floatValue;
        sk0Var.f28292n0 = (1.0f - sk0Var.f28293o0) * this.f24565a;
        sk0Var.invalidate();
    }
}
