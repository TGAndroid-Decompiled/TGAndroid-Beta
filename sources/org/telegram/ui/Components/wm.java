package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f34475a;
    public final bn f34476b;

    public wm(bn bnVar, int i10) {
        this.f34475a = i10;
        this.f34476b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34475a) {
            case 0:
                bn bnVar = this.f34476b;
                bnVar.getClass();
                bnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.invalidate();
                return;
            default:
                bn bnVar2 = this.f34476b;
                bnVar2.getClass();
                bnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.invalidate();
                return;
        }
    }
}
