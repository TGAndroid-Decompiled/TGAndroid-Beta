package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bn implements ValueAnimator.AnimatorUpdateListener {
    public final int f24992a;
    public final gn f24993b;

    public bn(gn gnVar, int i10) {
        this.f24992a = i10;
        this.f24993b = gnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24992a) {
            case 0:
                gn gnVar = this.f24993b;
                gnVar.getClass();
                gnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.invalidate();
                return;
            default:
                gn gnVar2 = this.f24993b;
                gnVar2.getClass();
                gnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar2.invalidate();
                return;
        }
    }
}
