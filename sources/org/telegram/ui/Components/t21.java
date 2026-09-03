package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28882a;
    public final v21 f28883b;

    public t21(v21 v21Var, int i10) {
        this.f28882a = i10;
        this.f28883b = v21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28882a) {
            case 0:
                v21 v21Var = this.f28883b;
                v21Var.getClass();
                v21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.h();
                v21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v21 v21Var2 = this.f28883b;
                v21Var2.H = max;
                v21Var2.h.invalidate();
                return;
        }
    }
}
