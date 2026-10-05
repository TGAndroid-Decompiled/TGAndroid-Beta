package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29580a;
    public final r31 f29581b;

    public p31(r31 r31Var, int i10) {
        this.f29580a = i10;
        this.f29581b = r31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29580a) {
            case 0:
                ai.n4 n4Var = this.f29581b.f30345f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                r31 r31Var = this.f29581b;
                r31Var.getClass();
                r31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                return;
        }
    }
}
