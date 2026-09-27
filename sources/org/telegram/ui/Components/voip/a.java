package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f29199a;
    public final e f29200b;

    public a(e eVar, int i10) {
        this.f29199a = i10;
        this.f29200b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29199a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f29200b;
                eVar.J = floatValue;
                eVar.invalidate();
                eVar.O = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f29200b;
                eVar2.K = floatValue2;
                eVar2.invalidate();
                eVar2.P = null;
                return;
            default:
                this.f29200b.W.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
