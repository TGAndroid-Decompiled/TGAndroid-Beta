package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33625a;
    public final ll0 f33626b;

    public zk0(ll0 ll0Var, float f7) {
        this.f33626b = ll0Var;
        this.f33625a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ll0 ll0Var = this.f33626b;
        ll0Var.f28408o0 = floatValue;
        ll0Var.f28407n0 = (1.0f - ll0Var.f28408o0) * this.f33625a;
        ll0Var.invalidate();
    }
}
