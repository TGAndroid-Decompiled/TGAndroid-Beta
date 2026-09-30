package org.telegram.ui;

import android.animation.ValueAnimator;
public final class nv implements ValueAnimator.AnimatorUpdateListener {
    public final int f35996a;
    public final qy f35997b;

    public nv(qy qyVar, int i10) {
        this.f35996a = i10;
        this.f35997b = qyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35996a) {
            case 0:
                qy qyVar = this.f35997b;
                qyVar.getClass();
                qyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f35997b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qy qyVar2 = this.f35997b;
                qyVar2.getClass();
                qyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
