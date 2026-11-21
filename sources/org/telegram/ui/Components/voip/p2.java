package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41263a;
    public final q2 f41264b;

    public p2(q2 q2Var, int i7) {
        this.f41263a = i7;
        this.f41264b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41263a) {
            case 0:
                q2 q2Var = this.f41264b;
                q2Var.getClass();
                q2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.a(q2Var.S, q2Var.T);
                return;
            default:
                q2 q2Var2 = this.f41264b;
                q2Var2.getClass();
                q2Var2.f41297a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                return;
        }
    }
}
