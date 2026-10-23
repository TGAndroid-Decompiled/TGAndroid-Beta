package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37665a;
    public final ey f37666b;

    public gv(ey eyVar, int i10) {
        this.f37665a = i10;
        this.f37666b = eyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37665a) {
            case 0:
                ey eyVar = this.f37666b;
                eyVar.getClass();
                eyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37666b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ey eyVar2 = this.f37666b;
                eyVar2.getClass();
                eyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
