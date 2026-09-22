package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29663a;
    public final v2 f29664b;

    public u2(v2 v2Var, int i10) {
        this.f29663a = i10;
        this.f29664b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29663a) {
            case 0:
                v2 v2Var = this.f29664b;
                v2Var.getClass();
                v2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.a(v2Var.R, v2Var.S);
                return;
            default:
                v2 v2Var2 = this.f29664b;
                v2Var2.getClass();
                v2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                return;
        }
    }
}
