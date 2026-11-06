package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f39963a;
    public final ii0 f39964b;

    public wh0(ii0 ii0Var, float f10) {
        this.f39964b = ii0Var;
        this.f39963a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ii0 ii0Var = this.f39964b;
        ii0Var.f34672o0 = floatValue;
        ii0Var.f34671n0 = (1.0f - ii0Var.f34672o0) * this.f39963a;
        ii0Var.invalidate();
    }
}
