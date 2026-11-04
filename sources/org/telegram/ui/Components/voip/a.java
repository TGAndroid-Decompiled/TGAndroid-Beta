package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f39204a;
    public final e f39205b;

    public a(e eVar, int i3) {
        this.f39204a = i3;
        this.f39205b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39204a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.f39205b;
                eVar.K = floatValue;
                eVar.invalidate();
                eVar.P = null;
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.f39205b;
                eVar2.L = floatValue2;
                eVar2.invalidate();
                eVar2.Q = null;
                return;
            default:
                this.f39205b.f39296a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
