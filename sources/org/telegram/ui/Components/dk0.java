package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24293a;
    public final pk0 f24294b;

    public dk0(pk0 pk0Var, float f10) {
        this.f24294b = pk0Var;
        this.f24293a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pk0 pk0Var = this.f24294b;
        pk0Var.f27907l0 = floatValue;
        pk0Var.f27906k0 = (1.0f - pk0Var.f27907l0) * this.f24293a;
        pk0Var.invalidate();
    }
}
