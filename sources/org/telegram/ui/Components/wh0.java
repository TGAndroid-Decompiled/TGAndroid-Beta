package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f39970a;
    public final ii0 f39971b;

    public wh0(ii0 ii0Var, float f10) {
        this.f39971b = ii0Var;
        this.f39970a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ii0 ii0Var = this.f39971b;
        ii0Var.f34635o0 = floatValue;
        ii0Var.f34634n0 = (1.0f - ii0Var.f34635o0) * this.f39970a;
        ii0Var.invalidate();
    }
}
