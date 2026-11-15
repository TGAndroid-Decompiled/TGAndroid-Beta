package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ae implements ValueAnimator.AnimatorUpdateListener {
    public final int f45033a;
    public final an f45034b;

    public ae(an anVar, int i7) {
        this.f45033a = i7;
        this.f45034b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45033a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an anVar = this.f45034b;
                anVar.Z8 = floatValue;
                ol olVar = anVar.f45277m1;
                if (olVar != null) {
                    olVar.invalidate();
                    anVar.A0.invalidate();
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f45034b;
                anVar2.getClass();
                anVar2.f45419x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.Tc();
                return;
            case 2:
                an anVar3 = this.f45034b;
                anVar3.getClass();
                anVar3.f45419x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar3.Tc();
                return;
            case 3:
                an anVar4 = this.f45034b;
                anVar4.getClass();
                anVar4.f45128ab = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar4.M9();
                return;
            default:
                an anVar5 = this.f45034b;
                anVar5.getClass();
                anVar5.f45128ab = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar5.M9();
                return;
        }
    }
}
