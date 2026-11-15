package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lu implements ValueAnimator.AnimatorUpdateListener {
    public final int f49039a;
    public final yw f49040b;

    public lu(yw ywVar, int i7) {
        this.f49039a = i7;
        this.f49040b = ywVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49039a) {
            case 0:
                this.f49040b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                yw ywVar = this.f49040b;
                ywVar.getClass();
                ywVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                yw ywVar2 = this.f49040b;
                ywVar2.getClass();
                ywVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
