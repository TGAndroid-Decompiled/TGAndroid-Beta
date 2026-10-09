package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33309a;
    public final kl0 f33310b;

    public yk0(kl0 kl0Var, float f7) {
        this.f33310b = kl0Var;
        this.f33309a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kl0 kl0Var = this.f33310b;
        kl0Var.f28093o0 = floatValue;
        kl0Var.f28092n0 = (1.0f - kl0Var.f28093o0) * this.f33309a;
        kl0Var.invalidate();
    }
}
