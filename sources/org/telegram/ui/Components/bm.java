package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bm implements ValueAnimator.AnimatorUpdateListener {
    public final int f27243a;
    public final gm f27244b;

    public bm(gm gmVar, int i9) {
        this.f27243a = i9;
        this.f27244b = gmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27243a) {
            case 0:
                gm gmVar = this.f27244b;
                gmVar.getClass();
                gmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar.invalidate();
                return;
            default:
                gm gmVar2 = this.f27244b;
                gmVar2.getClass();
                gmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar2.invalidate();
                return;
        }
    }
}
