package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f34541a;
    public final bn f34542b;

    public wm(bn bnVar, int i10) {
        this.f34541a = i10;
        this.f34542b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34541a) {
            case 0:
                bn bnVar = this.f34542b;
                bnVar.getClass();
                bnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.invalidate();
                return;
            default:
                bn bnVar2 = this.f34542b;
                bnVar2.getClass();
                bnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.invalidate();
                return;
        }
    }
}
