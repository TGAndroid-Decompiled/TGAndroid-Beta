package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ov implements ValueAnimator.AnimatorUpdateListener {
    public final int f36984a;
    public final oy f36985b;

    public ov(oy oyVar, int i10) {
        this.f36984a = i10;
        this.f36985b = oyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36984a) {
            case 0:
                oy oyVar = this.f36985b;
                oyVar.getClass();
                oyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36985b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oy oyVar2 = this.f36985b;
                oyVar2.getClass();
                oyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
