package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34104a;
    public final x2 f34105b;

    public w2(x2 x2Var, int i10) {
        this.f34104a = i10;
        this.f34105b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34104a) {
            case 0:
                x2 x2Var = this.f34105b;
                x2Var.getClass();
                x2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.a(x2Var.N, x2Var.O);
                return;
            default:
                x2 x2Var2 = this.f34105b;
                x2Var2.getClass();
                x2Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.invalidate();
                return;
        }
    }
}
