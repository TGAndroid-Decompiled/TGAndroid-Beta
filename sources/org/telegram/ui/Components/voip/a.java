package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    public final int f33471a;

    public final e f33472b;

    public a(e eVar, int i10) {
        this.f33471a = i10;
        this.f33472b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33471a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f33472b;
                eVar.F = fFloatValue;
                eVar.invalidate();
                eVar.K = null;
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f33472b;
                eVar2.G = fFloatValue2;
                eVar2.invalidate();
                eVar2.L = null;
                break;
            default:
                this.f33472b.S.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
