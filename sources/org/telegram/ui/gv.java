package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37667a;
    public final ey f37668b;

    public gv(ey eyVar, int i10) {
        this.f37667a = i10;
        this.f37668b = eyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37667a) {
            case 0:
                ey eyVar = this.f37668b;
                eyVar.getClass();
                eyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37668b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ey eyVar2 = this.f37668b;
                eyVar2.getClass();
                eyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
