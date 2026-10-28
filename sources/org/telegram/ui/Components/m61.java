package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public int f30420a = 0;
    public final int f30421b;
    public final q61 f30422c;

    public m61(q61 q61Var, int i10) {
        this.f30422c = q61Var;
        this.f30421b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f30421b);
        q61 q61Var = this.f30422c;
        q61Var.N = true;
        q61Var.f31807n.scrollBy(0, floatValue - this.f30420a);
        q61Var.N = false;
        this.f30420a = floatValue;
    }
}
