package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39695a;
    public final ey f39696b;

    public gv(ey eyVar, int i10) {
        this.f39695a = i10;
        this.f39696b = eyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39695a) {
            case 0:
                ey eyVar = this.f39696b;
                eyVar.getClass();
                eyVar.H4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39696b.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ey eyVar2 = this.f39696b;
                eyVar2.getClass();
                eyVar2.N4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
