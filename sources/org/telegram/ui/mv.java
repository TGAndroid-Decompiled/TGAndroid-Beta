package org.telegram.ui;

import android.animation.ValueAnimator;
public final class mv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39780a;
    public final ay f39781b;

    public mv(ay ayVar, int i10) {
        this.f39780a = i10;
        this.f39781b = ayVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39780a) {
            case 0:
                this.f39781b.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ay ayVar = this.f39781b;
                ayVar.getClass();
                ayVar.Q4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ay ayVar2 = this.f39781b;
                ayVar2.getClass();
                ayVar2.K4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
