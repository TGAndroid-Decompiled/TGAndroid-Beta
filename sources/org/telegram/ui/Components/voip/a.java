package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f39083a;
    public final e f39084b;

    public a(e eVar, int i7) {
        this.f39083a = i7;
        this.f39084b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39083a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f39084b;
                eVar.J = floatValue;
                eVar.invalidate();
                eVar.O = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f39084b;
                eVar2.K = floatValue2;
                eVar2.invalidate();
                eVar2.P = null;
                return;
            default:
                this.f39084b.W.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
