package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38674a;
    public final fy f38675b;

    public gv(fy fyVar, int i10) {
        this.f38674a = i10;
        this.f38675b = fyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38674a) {
            case 0:
                fy fyVar = this.f38675b;
                fyVar.getClass();
                fyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38675b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fy fyVar2 = this.f38675b;
                fyVar2.getClass();
                fyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
