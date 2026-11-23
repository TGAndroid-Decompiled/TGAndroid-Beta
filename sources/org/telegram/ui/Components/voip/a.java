package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f40846a;
    public final e f40847b;

    public a(e eVar, int i7) {
        this.f40846a = i7;
        this.f40847b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40846a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f40847b;
                eVar.K = floatValue;
                eVar.invalidate();
                eVar.P = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f40847b;
                eVar2.L = floatValue2;
                eVar2.invalidate();
                eVar2.Q = null;
                return;
            default:
                this.f40847b.f40935a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
