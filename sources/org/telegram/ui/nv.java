package org.telegram.ui;

import android.animation.ValueAnimator;
public final class nv implements ValueAnimator.AnimatorUpdateListener {
    public final int f36140a;
    public final qy f36141b;

    public nv(qy qyVar, int i10) {
        this.f36140a = i10;
        this.f36141b = qyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36140a) {
            case 0:
                qy qyVar = this.f36141b;
                qyVar.getClass();
                qyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36141b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qy qyVar2 = this.f36141b;
                qyVar2.getClass();
                qyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
