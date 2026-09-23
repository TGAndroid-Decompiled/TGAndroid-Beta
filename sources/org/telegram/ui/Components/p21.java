package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26920a;
    public final r21 f26921b;

    public p21(r21 r21Var, int i10) {
        this.f26920a = i10;
        this.f26921b = r21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26920a) {
            case 0:
                ai.n4 n4Var = this.f26921b.f27535f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                r21 r21Var = this.f26921b;
                r21Var.getClass();
                r21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                return;
        }
    }
}
