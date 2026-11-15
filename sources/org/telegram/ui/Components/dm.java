package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dm implements ValueAnimator.AnimatorUpdateListener {
    public final int f34008a;
    public final hm f34009b;

    public dm(hm hmVar, int i7) {
        this.f34008a = i7;
        this.f34009b = hmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34008a) {
            case 0:
                hm hmVar = this.f34009b;
                hmVar.getClass();
                hmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar.invalidate();
                return;
            default:
                hm hmVar2 = this.f34009b;
                hmVar2.getClass();
                hmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar2.invalidate();
                return;
        }
    }
}
