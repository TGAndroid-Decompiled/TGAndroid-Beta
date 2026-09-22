package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class eq implements ValueAnimator.AnimatorUpdateListener {
    public final int f33407a;
    public final nq f33408b;

    public eq(nq nqVar, int i10) {
        this.f33407a = i10;
        this.f33408b = nqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33407a) {
            case 0:
                nq nqVar = this.f33408b;
                nqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nqVar.h.invalidateSelf();
                return;
            default:
                nq nqVar2 = this.f33408b;
                nqVar2.getClass();
                nqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = nqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
