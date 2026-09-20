package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class eq implements ValueAnimator.AnimatorUpdateListener {
    public final int f33382a;
    public final nq f33383b;

    public eq(nq nqVar, int i10) {
        this.f33382a = i10;
        this.f33383b = nqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33382a) {
            case 0:
                nq nqVar = this.f33383b;
                nqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nqVar.h.invalidateSelf();
                return;
            default:
                nq nqVar2 = this.f33383b;
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
