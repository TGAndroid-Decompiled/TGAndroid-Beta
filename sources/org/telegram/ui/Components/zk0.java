package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33649a;
    public final ll0 f33650b;

    public zk0(ll0 ll0Var, float f7) {
        this.f33650b = ll0Var;
        this.f33649a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ll0 ll0Var = this.f33650b;
        ll0Var.f28484o0 = floatValue;
        ll0Var.f28483n0 = (1.0f - ll0Var.f28484o0) * this.f33649a;
        ll0Var.invalidate();
    }
}
