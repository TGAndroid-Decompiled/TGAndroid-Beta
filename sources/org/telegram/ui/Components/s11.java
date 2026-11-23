package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39457a;
    public final v11 f39458b;

    public s11(v11 v11Var, int i7) {
        this.f39457a = i7;
        this.f39458b = v11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39457a) {
            case 0:
                fi.u2 u2Var = this.f39458b.f40637f;
                u2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.invalidate();
                return;
            default:
                v11 v11Var = this.f39458b;
                v11Var.getClass();
                v11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.h();
                return;
        }
    }
}
