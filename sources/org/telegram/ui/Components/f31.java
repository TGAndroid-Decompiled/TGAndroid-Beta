package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24115a;
    public final h31 f24116b;

    public f31(h31 h31Var, int i10) {
        this.f24115a = i10;
        this.f24116b = h31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24115a) {
            case 0:
                ai.n4 n4Var = this.f24116b.f24685f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                h31 h31Var = this.f24116b;
                h31Var.getClass();
                h31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var.h();
                return;
        }
    }
}
