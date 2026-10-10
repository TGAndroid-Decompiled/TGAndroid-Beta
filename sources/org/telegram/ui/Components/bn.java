package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bn implements ValueAnimator.AnimatorUpdateListener {
    public final int f25004a;
    public final gn f25005b;

    public bn(gn gnVar, int i10) {
        this.f25004a = i10;
        this.f25005b = gnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25004a) {
            case 0:
                gn gnVar = this.f25005b;
                gnVar.getClass();
                gnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.invalidate();
                return;
            default:
                gn gnVar2 = this.f25005b;
                gnVar2.getClass();
                gnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar2.invalidate();
                return;
        }
    }
}
