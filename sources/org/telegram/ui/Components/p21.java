package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27721a;
    public final r21 f27722b;

    public p21(r21 r21Var, int i10) {
        this.f27721a = i10;
        this.f27722b = r21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27721a) {
            case 0:
                nh.a3 a3Var = this.f27722b.f28372f;
                a3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.invalidate();
                return;
            default:
                r21 r21Var = this.f27722b;
                r21Var.getClass();
                r21Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                return;
        }
    }
}
