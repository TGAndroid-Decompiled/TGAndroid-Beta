package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31314a;
    public final b2 f31315b;

    public a2(b2 b2Var, int i10) {
        this.f31314a = i10;
        this.f31315b = b2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31314a) {
            case 0:
                b2 b2Var = this.f31315b;
                b2Var.getClass();
                b2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.a(b2Var.R, b2Var.S);
                return;
            default:
                b2 b2Var2 = this.f31315b;
                b2Var2.getClass();
                b2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var2.invalidate();
                return;
        }
    }
}
