package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class eq implements ValueAnimator.AnimatorUpdateListener {
    public final int f37351a;
    public final nq f37352b;

    public eq(nq nqVar, int i10) {
        this.f37351a = i10;
        this.f37352b = nqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37351a) {
            case 0:
                nq nqVar = this.f37352b;
                nqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nqVar.h.invalidateSelf();
                return;
            default:
                nq nqVar2 = this.f37352b;
                nqVar2.getClass();
                nqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = nqVar2.f40365e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
