package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class kj0 implements ValueAnimator.AnimatorUpdateListener {

    public final float f30123a;

    public final wj0 f30124b;

    public kj0(wj0 wj0Var, float f10) {
        this.f30124b = wj0Var;
        this.f30123a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wj0 wj0Var = this.f30124b;
        wj0Var.f34254k0 = fFloatValue;
        wj0Var.f34253j0 = (1.0f - wj0Var.f34254k0) * this.f30123a;
        wj0Var.invalidate();
    }
}
