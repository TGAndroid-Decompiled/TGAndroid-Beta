package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28772a;
    public final q31 f28773b;

    public n31(q31 q31Var, int i10) {
        this.f28772a = i10;
        this.f28773b = q31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28772a) {
            case 0:
                ci.h3 h3Var = this.f28773b.f29786f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                return;
            default:
                q31 q31Var = this.f28773b;
                q31Var.getClass();
                q31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q31Var.h();
                return;
        }
    }
}
