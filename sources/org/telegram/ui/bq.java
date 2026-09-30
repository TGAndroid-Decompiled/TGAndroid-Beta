package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bq implements ValueAnimator.AnimatorUpdateListener {
    public final int f32467a;
    public final kq f32468b;

    public bq(kq kqVar, int i10) {
        this.f32467a = i10;
        this.f32468b = kqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32467a) {
            case 0:
                kq kqVar = this.f32468b;
                kqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kqVar.h.invalidateSelf();
                return;
            default:
                kq kqVar2 = this.f32468b;
                kqVar2.getClass();
                kqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = kqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
