package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ce implements ValueAnimator.AnimatorUpdateListener {
    public final int f44754a;
    public final an f44755b;

    public ce(an anVar, int i7) {
        this.f44754a = i7;
        this.f44755b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44754a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an anVar = this.f44755b;
                anVar.Y8 = floatValue;
                ol olVar = anVar.l1;
                if (olVar != null) {
                    olVar.invalidate();
                    anVar.f44038z0.invalidate();
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f44755b;
                anVar2.getClass();
                anVar2.f44003w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.Pc();
                return;
            case 2:
                an anVar3 = this.f44755b;
                anVar3.getClass();
                anVar3.f44003w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar3.Pc();
                return;
            case 3:
                an anVar4 = this.f44755b;
                anVar4.getClass();
                anVar4.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar4.K9();
                return;
            default:
                an anVar5 = this.f44755b;
                anVar5.getClass();
                anVar5.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar5.K9();
                return;
        }
    }
}
