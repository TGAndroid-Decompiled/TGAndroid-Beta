package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jz implements ValueAnimator.AnimatorUpdateListener {
    public final int f36713a;
    public final pz f36714b;

    public jz(pz pzVar, int i7) {
        this.f36713a = i7;
        this.f36714b = pzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36713a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz pzVar = this.f36714b;
                pzVar.f38712y = floatValue;
                pzVar.invalidate();
                return;
            default:
                pz pzVar2 = this.f36714b;
                pzVar2.getClass();
                pzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pzVar2.invalidate();
                return;
        }
    }
}
