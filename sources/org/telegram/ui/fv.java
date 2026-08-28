package org.telegram.ui;

import android.animation.ValueAnimator;
public final class fv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38352a;
    public final dy f38353b;

    public fv(dy dyVar, int i9) {
        this.f38352a = i9;
        this.f38353b = dyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38352a) {
            case 0:
                dy dyVar = this.f38353b;
                dyVar.getClass();
                dyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38353b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                dy dyVar2 = this.f38353b;
                dyVar2.getClass();
                dyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
