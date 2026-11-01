package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24846a;
    public final nj0 f24847b;

    public bj0(nj0 nj0Var, float f7) {
        this.f24847b = nj0Var;
        this.f24846a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        nj0 nj0Var = this.f24847b;
        nj0Var.f28887o0 = floatValue;
        nj0Var.f28886n0 = (1.0f - nj0Var.f28887o0) * this.f24846a;
        nj0Var.invalidate();
    }
}
