package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34275a;
    public final w2 f34276b;

    public v2(w2 w2Var, int i10) {
        this.f34275a = i10;
        this.f34276b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34275a) {
            case 0:
                w2 w2Var = this.f34276b;
                w2Var.getClass();
                w2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.a(w2Var.R, w2Var.S);
                return;
            default:
                w2 w2Var2 = this.f34276b;
                w2Var2.getClass();
                w2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.invalidate();
                return;
        }
    }
}
