package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f29549a;
    public final e f29550b;

    public a(e eVar, int i10) {
        this.f29549a = i10;
        this.f29550b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29549a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f29550b;
                eVar.G = floatValue;
                eVar.invalidate();
                eVar.L = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f29550b;
                eVar2.H = floatValue2;
                eVar2.invalidate();
                eVar2.M = null;
                return;
            default:
                this.f29550b.T.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
