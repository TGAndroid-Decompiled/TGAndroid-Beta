package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24591a;
    public final sk0 f24592b;

    public gk0(sk0 sk0Var, float f7) {
        this.f24592b = sk0Var;
        this.f24591a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.f24592b;
        sk0Var.f28310o0 = floatValue;
        sk0Var.f28309n0 = (1.0f - sk0Var.f28310o0) * this.f24591a;
        sk0Var.invalidate();
    }
}
