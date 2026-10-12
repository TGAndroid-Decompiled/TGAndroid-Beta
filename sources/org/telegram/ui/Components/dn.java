package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dn implements ValueAnimator.AnimatorUpdateListener {
    public final int f25417a;
    public final in f25418b;

    public dn(in inVar, int i10) {
        this.f25417a = i10;
        this.f25418b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25417a) {
            case 0:
                in inVar = this.f25418b;
                inVar.getClass();
                inVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                inVar.invalidate();
                return;
            default:
                in inVar2 = this.f25418b;
                inVar2.getClass();
                inVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                inVar2.invalidate();
                return;
        }
    }
}
