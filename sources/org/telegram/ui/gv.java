package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37329a;
    public final ey f37330b;

    public gv(ey eyVar, int i10) {
        this.f37329a = i10;
        this.f37330b = eyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37329a) {
            case 0:
                ey eyVar = this.f37330b;
                eyVar.getClass();
                eyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37330b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ey eyVar2 = this.f37330b;
                eyVar2.getClass();
                eyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
