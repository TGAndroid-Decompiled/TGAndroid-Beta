package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24566a;
    public final sk0 f24567b;

    public gk0(sk0 sk0Var, float f7) {
        this.f24567b = sk0Var;
        this.f24566a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.f24567b;
        sk0Var.f28290o0 = floatValue;
        sk0Var.f28289n0 = (1.0f - sk0Var.f28290o0) * this.f24566a;
        sk0Var.invalidate();
    }
}
