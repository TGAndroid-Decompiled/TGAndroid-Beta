package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class w11 implements ValueAnimator.AnimatorUpdateListener {

    public final int f34090a;

    public final y11 f34091b;

    public w11(y11 y11Var, int i10) {
        this.f34090a = i10;
        this.f34091b = y11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34090a) {
            case 0:
                jh.a3 a3Var = this.f34091b.f34782f;
                a3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.invalidate();
                break;
            default:
                y11 y11Var = this.f34091b;
                y11Var.getClass();
                y11Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.h();
                break;
        }
    }
}
