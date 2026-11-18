package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f40748a;
    public final e f40749b;

    public a(e eVar, int i7) {
        this.f40748a = i7;
        this.f40749b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40748a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f40749b;
                eVar.K = floatValue;
                eVar.invalidate();
                eVar.P = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f40749b;
                eVar2.L = floatValue2;
                eVar2.invalidate();
                eVar2.Q = null;
                return;
            default:
                this.f40749b.f40837a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
