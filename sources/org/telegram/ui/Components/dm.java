package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dm implements ValueAnimator.AnimatorUpdateListener {
    public final int f33995a;
    public final hm f33996b;

    public dm(hm hmVar, int i7) {
        this.f33995a = i7;
        this.f33996b = hmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33995a) {
            case 0:
                hm hmVar = this.f33996b;
                hmVar.getClass();
                hmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar.invalidate();
                return;
            default:
                hm hmVar2 = this.f33996b;
                hmVar2.getClass();
                hmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar2.invalidate();
                return;
        }
    }
}
