package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j31 implements ValueAnimator.AnimatorUpdateListener {
    public int f34925a = 0;
    public final int f34926b;
    public final n31 f34927c;

    public j31(n31 n31Var, int i3) {
        this.f34927c = n31Var;
        this.f34926b = i3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f34926b);
        n31 n31Var = this.f34927c;
        n31Var.O = true;
        n31Var.f36359n.scrollBy(0, floatValue - this.f34925a);
        n31Var.O = false;
        this.f34925a = floatValue;
    }
}
