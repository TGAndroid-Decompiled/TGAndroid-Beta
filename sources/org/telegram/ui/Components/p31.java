package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p31 implements ValueAnimator.AnimatorUpdateListener {
    public int f36880a = 0;
    public final int f36881b;
    public final u31 f36882c;

    public p31(u31 u31Var, int i7) {
        this.f36882c = u31Var;
        this.f36881b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f36881b);
        u31 u31Var = this.f36882c;
        u31Var.N = true;
        u31Var.f38583n.scrollBy(0, floatValue - this.f36880a);
        u31Var.N = false;
        this.f36880a = floatValue;
    }
}
