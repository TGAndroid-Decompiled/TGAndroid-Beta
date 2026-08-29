package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33758a;
    public final l3 f33759b;

    public i3(l3 l3Var, int i10) {
        this.f33758a = i10;
        this.f33759b = l3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33758a) {
            case 0:
                l3 l3Var = this.f33759b;
                l3Var.getClass();
                l3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.invalidate();
                return;
            case 1:
                l3 l3Var2 = this.f33759b;
                l3Var2.getClass();
                l3Var2.f33844w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var2.invalidate();
                return;
            case 2:
                l3 l3Var3 = this.f33759b;
                l3Var3.getClass();
                l3Var3.f33843s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var3.invalidate();
                return;
            default:
                l3 l3Var4 = this.f33759b;
                l3Var4.getClass();
                l3Var4.f33842r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var4.invalidate();
                return;
        }
    }
}
