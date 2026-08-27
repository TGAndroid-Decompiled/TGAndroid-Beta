package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class yl implements ValueAnimator.AnimatorUpdateListener {

    public final int f34916a;

    public final dm f34917b;

    public yl(dm dmVar, int i10) {
        this.f34916a = i10;
        this.f34917b = dmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34916a) {
            case 0:
                dm dmVar = this.f34917b;
                dmVar.getClass();
                dmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dmVar.invalidate();
                break;
            default:
                dm dmVar2 = this.f34917b;
                dmVar2.getClass();
                dmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dmVar2.invalidate();
                break;
        }
    }
}
