package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ai0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33000a;
    public final mi0 f33001b;

    public ai0(mi0 mi0Var, float f10) {
        this.f33001b = mi0Var;
        this.f33000a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mi0 mi0Var = this.f33001b;
        mi0Var.f37286p0 = floatValue;
        mi0Var.f37285o0 = (1.0f - mi0Var.f37286p0) * this.f33000a;
        mi0Var.invalidate();
    }
}
