package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hm implements ValueAnimator.AnimatorUpdateListener {
    public final int f25446a;
    public final mm f25447b;

    public hm(mm mmVar, int i10) {
        this.f25446a = i10;
        this.f25447b = mmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25446a) {
            case 0:
                mm mmVar = this.f25447b;
                mmVar.getClass();
                mmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.invalidate();
                return;
            default:
                mm mmVar2 = this.f25447b;
                mmVar2.getClass();
                mmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar2.invalidate();
                return;
        }
    }
}
