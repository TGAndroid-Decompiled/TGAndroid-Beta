package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public int f36531a = 0;
    public final int f36532b;
    public final t31 f36533c;

    public o31(t31 t31Var, int i7) {
        this.f36533c = t31Var;
        this.f36532b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f36532b);
        t31 t31Var = this.f36533c;
        t31Var.N = true;
        t31Var.f38229n.scrollBy(0, floatValue - this.f36531a);
        t31Var.N = false;
        this.f36531a = floatValue;
    }
}
