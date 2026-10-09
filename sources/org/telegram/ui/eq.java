package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class eq implements ValueAnimator.AnimatorUpdateListener {
    public final int f37305a;
    public final nq f37306b;

    public eq(nq nqVar, int i10) {
        this.f37305a = i10;
        this.f37306b = nqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37305a) {
            case 0:
                nq nqVar = this.f37306b;
                nqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nqVar.h.invalidateSelf();
                return;
            default:
                nq nqVar2 = this.f37306b;
                nqVar2.getClass();
                nqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = nqVar2.f40319e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
