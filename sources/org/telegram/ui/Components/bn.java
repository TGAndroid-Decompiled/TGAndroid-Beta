package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bn implements ValueAnimator.AnimatorUpdateListener {
    public final int f25050a;
    public final gn f25051b;

    public bn(gn gnVar, int i10) {
        this.f25050a = i10;
        this.f25051b = gnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25050a) {
            case 0:
                gn gnVar = this.f25051b;
                gnVar.getClass();
                gnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.invalidate();
                return;
            default:
                gn gnVar2 = this.f25051b;
                gnVar2.getClass();
                gnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar2.invalidate();
                return;
        }
    }
}
