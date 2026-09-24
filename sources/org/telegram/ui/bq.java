package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bq implements ValueAnimator.AnimatorUpdateListener {
    public final int f32451a;
    public final kq f32452b;

    public bq(kq kqVar, int i10) {
        this.f32451a = i10;
        this.f32452b = kqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32451a) {
            case 0:
                kq kqVar = this.f32452b;
                kqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kqVar.h.invalidateSelf();
                return;
            default:
                kq kqVar2 = this.f32452b;
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
