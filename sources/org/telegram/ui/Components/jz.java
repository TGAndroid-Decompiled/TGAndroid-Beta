package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jz implements ValueAnimator.AnimatorUpdateListener {
    public final int f36719a;
    public final pz f36720b;

    public jz(pz pzVar, int i7) {
        this.f36719a = i7;
        this.f36720b = pzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36719a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz pzVar = this.f36720b;
                pzVar.f38714y = floatValue;
                pzVar.invalidate();
                return;
            default:
                pz pzVar2 = this.f36720b;
                pzVar2.getClass();
                pzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pzVar2.invalidate();
                return;
        }
    }
}
