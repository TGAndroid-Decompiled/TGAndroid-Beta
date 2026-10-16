package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29549a;
    public final x31 f29550b;

    public v31(x31 x31Var, int i10) {
        this.f29549a = i10;
        this.f29550b = x31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29549a) {
            case 0:
                x31 x31Var = this.f29550b;
                x31Var.getClass();
                x31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.h();
                x31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x31 x31Var2 = this.f29550b;
                x31Var2.K = max;
                x31Var2.h.invalidate();
                return;
        }
    }
}
