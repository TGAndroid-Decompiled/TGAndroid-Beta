package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class cq implements ValueAnimator.AnimatorUpdateListener {
    public final int f33207a;
    public final lq f33208b;

    public cq(lq lqVar, int i10) {
        this.f33207a = i10;
        this.f33208b = lqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33207a) {
            case 0:
                lq lqVar = this.f33208b;
                lqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lqVar.h.invalidateSelf();
                return;
            default:
                lq lqVar2 = this.f33208b;
                lqVar2.getClass();
                lqVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = lqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
