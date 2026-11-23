package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gz implements ValueAnimator.AnimatorUpdateListener {
    public final int f35578a;
    public final mz f35579b;

    public gz(mz mzVar, int i7) {
        this.f35578a = i7;
        this.f35579b = mzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35578a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mz mzVar = this.f35579b;
                mzVar.f37595y = floatValue;
                mzVar.invalidate();
                return;
            default:
                mz mzVar2 = this.f35579b;
                mzVar2.getClass();
                mzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzVar2.invalidate();
                return;
        }
    }
}
