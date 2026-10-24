package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30860a;
    public final ym f30861b;

    public tm(ym ymVar, int i10) {
        this.f30860a = i10;
        this.f30861b = ymVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30860a) {
            case 0:
                ym ymVar = this.f30861b;
                ymVar.getClass();
                ymVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar.invalidate();
                return;
            default:
                ym ymVar2 = this.f30861b;
                ymVar2.getClass();
                ymVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar2.invalidate();
                return;
        }
    }
}
