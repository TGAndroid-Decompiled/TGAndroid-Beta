package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lu implements ValueAnimator.AnimatorUpdateListener {
    public final int f49035a;
    public final yw f49036b;

    public lu(yw ywVar, int i7) {
        this.f49035a = i7;
        this.f49036b = ywVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49035a) {
            case 0:
                this.f49036b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                yw ywVar = this.f49036b;
                ywVar.getClass();
                ywVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                yw ywVar2 = this.f49036b;
                ywVar2.getClass();
                ywVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
