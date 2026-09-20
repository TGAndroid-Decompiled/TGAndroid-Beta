package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23732a;
    public final g31 f23733b;

    public e31(g31 g31Var, int i10) {
        this.f23732a = i10;
        this.f23733b = g31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23732a) {
            case 0:
                ai.n4 n4Var = this.f23733b.f24243f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                g31 g31Var = this.f23733b;
                g31Var.getClass();
                g31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var.h();
                return;
        }
    }
}
