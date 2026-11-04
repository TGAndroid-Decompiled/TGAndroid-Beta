package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zh0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f41045a;
    public final li0 f41046b;

    public zh0(li0 li0Var, float f10) {
        this.f41046b = li0Var;
        this.f41045a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        li0 li0Var = this.f41046b;
        li0Var.f35764p0 = floatValue;
        li0Var.f35763o0 = (1.0f - li0Var.f35764p0) * this.f41045a;
        li0Var.invalidate();
    }
}
