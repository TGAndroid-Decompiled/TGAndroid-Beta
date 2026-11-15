package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40884a;
    public final r2 f40885b;

    public q2(r2 r2Var, int i7) {
        this.f40884a = i7;
        this.f40885b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40884a) {
            case 0:
                r2 r2Var = this.f40885b;
                r2Var.getClass();
                r2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.a(r2Var.S, r2Var.T);
                return;
            default:
                r2 r2Var2 = this.f40885b;
                r2Var2.getClass();
                r2Var2.f40920a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                return;
        }
    }
}
