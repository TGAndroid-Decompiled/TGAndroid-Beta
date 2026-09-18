package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25157a;
    public final l31 f25158b;

    public j31(l31 l31Var, int i10) {
        this.f25157a = i10;
        this.f25158b = l31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25157a) {
            case 0:
                l31 l31Var = this.f25158b;
                l31Var.getClass();
                l31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.h();
                l31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l31 l31Var2 = this.f25158b;
                l31Var2.K = max;
                l31Var2.h.invalidate();
                return;
        }
    }
}
