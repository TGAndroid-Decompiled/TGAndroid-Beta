package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39390a;
    public final zx f39391b;

    public lv(zx zxVar, int i10) {
        this.f39390a = i10;
        this.f39391b = zxVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39390a) {
            case 0:
                this.f39391b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                zx zxVar = this.f39391b;
                zxVar.getClass();
                zxVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zx zxVar2 = this.f39391b;
                zxVar2.getClass();
                zxVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
