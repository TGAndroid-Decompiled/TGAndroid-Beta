package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public int f36511a = 0;
    public final int f36512b;
    public final t31 f36513c;

    public o31(t31 t31Var, int i7) {
        this.f36513c = t31Var;
        this.f36512b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f36512b);
        t31 t31Var = this.f36513c;
        t31Var.N = true;
        t31Var.f38201n.scrollBy(0, floatValue - this.f36511a);
        t31Var.N = false;
        this.f36511a = floatValue;
    }
}
