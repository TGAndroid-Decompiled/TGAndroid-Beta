package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ai0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f32997a;
    public final mi0 f32998b;

    public ai0(mi0 mi0Var, float f10) {
        this.f32998b = mi0Var;
        this.f32997a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mi0 mi0Var = this.f32998b;
        mi0Var.f37287p0 = floatValue;
        mi0Var.f37286o0 = (1.0f - mi0Var.f37287p0) * this.f32997a;
        mi0Var.invalidate();
    }
}
