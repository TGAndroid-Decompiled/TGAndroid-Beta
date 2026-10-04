package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f31761a;
    public final e f31762b;

    public a(e eVar, int i10) {
        this.f31761a = i10;
        this.f31762b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31761a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f31762b;
                eVar.J = floatValue;
                eVar.invalidate();
                eVar.O = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f31762b;
                eVar2.K = floatValue2;
                eVar2.invalidate();
                eVar2.P = null;
                return;
            default:
                this.f31762b.W.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
