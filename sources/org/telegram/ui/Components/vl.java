package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vl implements ValueAnimator.AnimatorUpdateListener {
    public final int f39175a;
    public final zl f39176b;

    public vl(zl zlVar, int i3) {
        this.f39175a = i3;
        this.f39176b = zlVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39175a) {
            case 0:
                zl zlVar = this.f39176b;
                zlVar.getClass();
                zlVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar.invalidate();
                return;
            default:
                zl zlVar2 = this.f39176b;
                zlVar2.getClass();
                zlVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar2.invalidate();
                return;
        }
    }
}
