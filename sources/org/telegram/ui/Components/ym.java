package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ym implements ValueAnimator.AnimatorUpdateListener {
    public final int f31329a;
    public final dn f31330b;

    public ym(dn dnVar, int i10) {
        this.f31329a = i10;
        this.f31330b = dnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31329a) {
            case 0:
                dn dnVar = this.f31330b;
                dnVar.getClass();
                dnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dnVar.invalidate();
                return;
            default:
                dn dnVar2 = this.f31330b;
                dnVar2.getClass();
                dnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dnVar2.invalidate();
                return;
        }
    }
}
