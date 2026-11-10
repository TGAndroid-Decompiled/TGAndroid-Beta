package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public int f36471a = 0;
    public final int f36472b;
    public final t31 f36473c;

    public o31(t31 t31Var, int i7) {
        this.f36473c = t31Var;
        this.f36472b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f36472b);
        t31 t31Var = this.f36473c;
        t31Var.N = true;
        t31Var.f38155n.scrollBy(0, floatValue - this.f36471a);
        t31Var.N = false;
        this.f36471a = floatValue;
    }
}
