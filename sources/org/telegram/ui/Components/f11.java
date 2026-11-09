package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33558a;
    public final i11 f33559b;

    public f11(i11 i11Var, int i7) {
        this.f33558a = i7;
        this.f33559b = i11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33558a) {
            case 0:
                di.b3 b3Var = this.f33559b.f34524f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                i11 i11Var = this.f33559b;
                i11Var.getClass();
                i11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i11Var.h();
                return;
        }
    }
}
