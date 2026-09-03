package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bq implements ValueAnimator.AnimatorUpdateListener {
    public final int f35587a;
    public final kq f35588b;

    public bq(kq kqVar, int i10) {
        this.f35587a = i10;
        this.f35588b = kqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35587a) {
            case 0:
                kq kqVar = this.f35588b;
                kqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kqVar.h.invalidateSelf();
                return;
            default:
                kq kqVar2 = this.f35588b;
                kqVar2.getClass();
                kqVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = kqVar2.f38372e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
