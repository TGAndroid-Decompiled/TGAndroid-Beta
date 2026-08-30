package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class im implements ValueAnimator.AnimatorUpdateListener {
    public final int f25744a;
    public final nm f25745b;

    public im(nm nmVar, int i10) {
        this.f25744a = i10;
        this.f25745b = nmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25744a) {
            case 0:
                nm nmVar = this.f25745b;
                nmVar.getClass();
                nmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.invalidate();
                return;
            default:
                nm nmVar2 = this.f25745b;
                nmVar2.getClass();
                nmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar2.invalidate();
                return;
        }
    }
}
