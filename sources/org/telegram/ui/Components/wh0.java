package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f39928a;
    public final ii0 f39929b;

    public wh0(ii0 ii0Var, float f10) {
        this.f39929b = ii0Var;
        this.f39928a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ii0 ii0Var = this.f39929b;
        ii0Var.f34709o0 = floatValue;
        ii0Var.f34708n0 = (1.0f - ii0Var.f34709o0) * this.f39928a;
        ii0Var.invalidate();
    }
}
