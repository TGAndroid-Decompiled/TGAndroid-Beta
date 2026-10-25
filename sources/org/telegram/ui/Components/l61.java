package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l61 implements ValueAnimator.AnimatorUpdateListener {
    public int f30089a = 0;
    public final int f30090b;
    public final p61 f30091c;

    public l61(p61 p61Var, int i10) {
        this.f30091c = p61Var;
        this.f30090b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f30090b);
        p61 p61Var = this.f30091c;
        p61Var.N = true;
        p61Var.f31453n.scrollBy(0, floatValue - this.f30089a);
        p61Var.N = false;
        this.f30089a = floatValue;
    }
}
