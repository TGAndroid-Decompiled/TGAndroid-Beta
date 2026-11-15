package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tz implements ValueAnimator.AnimatorUpdateListener {
    public final int f39834a;
    public final vz f39835b;

    public tz(vz vzVar, int i7) {
        this.f39834a = i7;
        this.f39835b = vzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39834a) {
            case 0:
                vz vzVar = this.f39835b;
                vzVar.getClass();
                vzVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar.invalidate();
                return;
            case 1:
                vz vzVar2 = this.f39835b;
                vzVar2.getClass();
                vzVar2.f41205w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                vzVar2.invalidate();
                return;
            default:
                vz vzVar3 = this.f39835b;
                vzVar3.getClass();
                vzVar3.f41202n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar3.invalidate();
                return;
        }
    }
}
