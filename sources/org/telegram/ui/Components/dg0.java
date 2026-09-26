package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23615a;
    public final fg0 f23616b;

    public dg0(fg0 fg0Var, int i10) {
        this.f23615a = i10;
        this.f23616b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23615a) {
            case 0:
                fg0 fg0Var = this.f23616b;
                fg0Var.getClass();
                fg0Var.f24183y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.invalidate();
                return;
            default:
                fg0 fg0Var2 = this.f23616b;
                fg0Var2.getClass();
                fg0Var2.f24183y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.invalidate();
                return;
        }
    }
}
