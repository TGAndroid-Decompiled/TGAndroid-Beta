package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d61 implements ValueAnimator.AnimatorUpdateListener {
    public int f25609a = 0;
    public final int f25610b;
    public final h61 f25611c;

    public d61(h61 h61Var, int i10) {
        this.f25611c = h61Var;
        this.f25610b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f25610b);
        h61 h61Var = this.f25611c;
        h61Var.N = true;
        h61Var.f26882n.scrollBy(0, floatValue - this.f25609a);
        h61Var.N = false;
        this.f25609a = floatValue;
    }
}
