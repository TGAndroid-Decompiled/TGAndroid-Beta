package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24305a;
    public final pk0 f24306b;

    public dk0(pk0 pk0Var, float f10) {
        this.f24306b = pk0Var;
        this.f24305a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pk0 pk0Var = this.f24306b;
        pk0Var.f27902l0 = floatValue;
        pk0Var.f27901k0 = (1.0f - pk0Var.f27902l0) * this.f24305a;
        pk0Var.invalidate();
    }
}
