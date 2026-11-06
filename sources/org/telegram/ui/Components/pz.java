package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pz implements ValueAnimator.AnimatorUpdateListener {
    public final int f37209a;
    public final rz f37210b;

    public pz(rz rzVar, int i7) {
        this.f37209a = i7;
        this.f37210b = rzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37209a) {
            case 0:
                rz rzVar = this.f37210b;
                rzVar.getClass();
                rzVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar.invalidate();
                return;
            case 1:
                rz rzVar2 = this.f37210b;
                rzVar2.getClass();
                rzVar2.f37897w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                rzVar2.invalidate();
                return;
            default:
                rz rzVar3 = this.f37210b;
                rzVar3.getClass();
                rzVar3.f37894n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar3.invalidate();
                return;
        }
    }
}
