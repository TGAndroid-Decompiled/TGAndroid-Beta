package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f31309a;
    public final an f31310b;

    public vm(an anVar, int i10) {
        this.f31309a = i10;
        this.f31310b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31309a) {
            case 0:
                an anVar = this.f31310b;
                anVar.getClass();
                anVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.invalidate();
                return;
            default:
                an anVar2 = this.f31310b;
                anVar2.getClass();
                anVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.invalidate();
                return;
        }
    }
}
