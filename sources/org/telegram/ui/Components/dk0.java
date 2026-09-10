package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f22441a;
    public final pk0 f22442b;

    public dk0(pk0 pk0Var, float f7) {
        this.f22442b = pk0Var;
        this.f22441a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pk0 pk0Var = this.f22442b;
        pk0Var.f26186o0 = floatValue;
        pk0Var.f26185n0 = (1.0f - pk0Var.f26186o0) * this.f22441a;
        pk0Var.invalidate();
    }
}
