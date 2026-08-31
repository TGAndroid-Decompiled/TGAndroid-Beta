package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f31944a;
    public final e f31945b;

    public a(e eVar, int i10) {
        this.f31944a = i10;
        this.f31945b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31944a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f31945b;
                eVar.G = floatValue;
                eVar.invalidate();
                eVar.L = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f31945b;
                eVar2.H = floatValue2;
                eVar2.invalidate();
                eVar2.M = null;
                return;
            default:
                this.f31945b.T.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
