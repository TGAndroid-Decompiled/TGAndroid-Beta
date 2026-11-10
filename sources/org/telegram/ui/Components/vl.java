package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vl implements ValueAnimator.AnimatorUpdateListener {
    public final int f39052a;
    public final zl f39053b;

    public vl(zl zlVar, int i7) {
        this.f39052a = i7;
        this.f39053b = zlVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39052a) {
            case 0:
                zl zlVar = this.f39053b;
                zlVar.getClass();
                zlVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar.invalidate();
                return;
            default:
                zl zlVar2 = this.f39053b;
                zlVar2.getClass();
                zlVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar2.invalidate();
                return;
        }
    }
}
