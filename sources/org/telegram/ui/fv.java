package org.telegram.ui;

import android.animation.ValueAnimator;
public final class fv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37043a;
    public final ey f37044b;

    public fv(ey eyVar, int i10) {
        this.f37043a = i10;
        this.f37044b = eyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37043a) {
            case 0:
                ey eyVar = this.f37044b;
                eyVar.getClass();
                eyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37044b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ey eyVar2 = this.f37044b;
                eyVar2.getClass();
                eyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
