package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f40761a;
    public final e f40762b;

    public a(e eVar, int i7) {
        this.f40761a = i7;
        this.f40762b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40761a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f40762b;
                eVar.K = floatValue;
                eVar.invalidate();
                eVar.P = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f40762b;
                eVar2.L = floatValue2;
                eVar2.invalidate();
                eVar2.Q = null;
                return;
            default:
                this.f40762b.f40834a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
