package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i31 implements ValueAnimator.AnimatorUpdateListener {
    public int f34484a = 0;
    public final int f34485b;
    public final n31 f34486c;

    public i31(n31 n31Var, int i7) {
        this.f34486c = n31Var;
        this.f34485b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f34485b);
        n31 n31Var = this.f34486c;
        n31Var.N = true;
        n31Var.f36236n.scrollBy(0, floatValue - this.f34484a);
        n31Var.N = false;
        this.f34484a = floatValue;
    }
}
