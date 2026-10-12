package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dn implements ValueAnimator.AnimatorUpdateListener {
    public final int f25420a;
    public final in f25421b;

    public dn(in inVar, int i10) {
        this.f25420a = i10;
        this.f25421b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25420a) {
            case 0:
                in inVar = this.f25421b;
                inVar.getClass();
                inVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                inVar.invalidate();
                return;
            default:
                in inVar2 = this.f25421b;
                inVar2.getClass();
                inVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                inVar2.invalidate();
                return;
        }
    }
}
