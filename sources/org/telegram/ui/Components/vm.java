package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f31308a;
    public final an f31309b;

    public vm(an anVar, int i10) {
        this.f31308a = i10;
        this.f31309b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31308a) {
            case 0:
                an anVar = this.f31309b;
                anVar.getClass();
                anVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.invalidate();
                return;
            default:
                an anVar2 = this.f31309b;
                anVar2.getClass();
                anVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.invalidate();
                return;
        }
    }
}
