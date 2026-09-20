package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f23603a;
    public final pk0 f23604b;

    public dk0(pk0 pk0Var, float f7) {
        this.f23604b = pk0Var;
        this.f23603a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pk0 pk0Var = this.f23604b;
        pk0Var.f27363o0 = floatValue;
        pk0Var.f27362n0 = (1.0f - pk0Var.f27363o0) * this.f23603a;
        pk0Var.invalidate();
    }
}
