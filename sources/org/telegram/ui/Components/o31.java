package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29212a;
    public final q31 f29213b;

    public o31(q31 q31Var, int i10) {
        this.f29212a = i10;
        this.f29213b = q31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29212a) {
            case 0:
                ai.n4 n4Var = this.f29213b.f29884f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                q31 q31Var = this.f29213b;
                q31Var.getClass();
                q31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q31Var.h();
                return;
        }
    }
}
