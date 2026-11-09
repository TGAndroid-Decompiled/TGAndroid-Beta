package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lu implements ValueAnimator.AnimatorUpdateListener {
    public final int f47678a;
    public final yw f47679b;

    public lu(yw ywVar, int i7) {
        this.f47678a = i7;
        this.f47679b = ywVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47678a) {
            case 0:
                this.f47679b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                yw ywVar = this.f47679b;
                ywVar.getClass();
                ywVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                yw ywVar2 = this.f47679b;
                ywVar2.getClass();
                ywVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
