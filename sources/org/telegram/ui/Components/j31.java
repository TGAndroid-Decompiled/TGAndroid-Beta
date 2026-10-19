package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27415a;
    public final l31 f27416b;

    public j31(l31 l31Var, int i10) {
        this.f27415a = i10;
        this.f27416b = l31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27415a) {
            case 0:
                ci.i3 i3Var = this.f27416b.f28067f;
                i3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.invalidate();
                return;
            default:
                l31 l31Var = this.f27416b;
                l31Var.getClass();
                l31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.h();
                return;
        }
    }
}
