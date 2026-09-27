package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class cq implements ValueAnimator.AnimatorUpdateListener {
    public final int f32779a;
    public final lq f32780b;

    public cq(lq lqVar, int i10) {
        this.f32779a = i10;
        this.f32780b = lqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32779a) {
            case 0:
                lq lqVar = this.f32780b;
                lqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lqVar.h.invalidateSelf();
                return;
            default:
                lq lqVar2 = this.f32780b;
                lqVar2.getClass();
                lqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = lqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
