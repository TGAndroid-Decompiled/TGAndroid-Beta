package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f34478a;
    public final bn f34479b;

    public wm(bn bnVar, int i10) {
        this.f34478a = i10;
        this.f34479b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34478a) {
            case 0:
                bn bnVar = this.f34479b;
                bnVar.getClass();
                bnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.invalidate();
                return;
            default:
                bn bnVar2 = this.f34479b;
                bnVar2.getClass();
                bnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.invalidate();
                return;
        }
    }
}
