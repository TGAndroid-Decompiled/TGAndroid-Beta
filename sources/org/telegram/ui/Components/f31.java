package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24012a;
    public final h31 f24013b;

    public f31(h31 h31Var, int i10) {
        this.f24012a = i10;
        this.f24013b = h31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24012a) {
            case 0:
                ai.n4 n4Var = this.f24013b.f24541f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                h31 h31Var = this.f24013b;
                h31Var.getClass();
                h31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var.h();
                return;
        }
    }
}
