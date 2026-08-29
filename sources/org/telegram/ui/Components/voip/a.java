package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f33604a;
    public final e f33605b;

    public a(e eVar, int i10) {
        this.f33604a = i10;
        this.f33605b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33604a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f33605b;
                eVar.F = floatValue;
                eVar.invalidate();
                eVar.K = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f33605b;
                eVar2.G = floatValue2;
                eVar2.invalidate();
                eVar2.L = null;
                return;
            default:
                this.f33605b.S.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
