package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bz implements ValueAnimator.AnimatorUpdateListener {
    public final int f33430a;
    public final gz f33431b;

    public bz(gz gzVar, int i7) {
        this.f33430a = i7;
        this.f33431b = gzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33430a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gz gzVar = this.f33431b;
                gzVar.f35126y = floatValue;
                gzVar.invalidate();
                return;
            default:
                gz gzVar2 = this.f33431b;
                gzVar2.getClass();
                gzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar2.invalidate();
                return;
        }
    }
}
