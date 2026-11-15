package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tz implements ValueAnimator.AnimatorUpdateListener {
    public final int f39837a;
    public final vz f39838b;

    public tz(vz vzVar, int i7) {
        this.f39837a = i7;
        this.f39838b = vzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39837a) {
            case 0:
                vz vzVar = this.f39838b;
                vzVar.getClass();
                vzVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar.invalidate();
                return;
            case 1:
                vz vzVar2 = this.f39838b;
                vzVar2.getClass();
                vzVar2.f41202w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                vzVar2.invalidate();
                return;
            default:
                vz vzVar3 = this.f39838b;
                vzVar3.getClass();
                vzVar3.f41199n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar3.invalidate();
                return;
        }
    }
}
