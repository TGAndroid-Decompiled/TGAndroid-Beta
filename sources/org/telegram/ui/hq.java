package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hq implements ValueAnimator.AnimatorUpdateListener {
    public final int f37118a;
    public final qq f37119b;

    public hq(qq qqVar, int i10) {
        this.f37118a = i10;
        this.f37119b = qqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37118a) {
            case 0:
                qq qqVar = this.f37119b;
                qqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qqVar.h.invalidateSelf();
                return;
            default:
                qq qqVar2 = this.f37119b;
                qqVar2.getClass();
                qqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = qqVar2.f39971e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
