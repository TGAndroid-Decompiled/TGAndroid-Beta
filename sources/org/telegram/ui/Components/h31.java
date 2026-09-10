package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23513a;
    public final j31 f23514b;

    public h31(j31 j31Var, int i10) {
        this.f23513a = i10;
        this.f23514b = j31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23513a) {
            case 0:
                j31 j31Var = this.f23514b;
                j31Var.getClass();
                j31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j31Var.h();
                j31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j31 j31Var2 = this.f23514b;
                j31Var2.K = max;
                j31Var2.h.invalidate();
                return;
        }
    }
}
