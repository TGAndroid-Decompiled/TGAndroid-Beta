package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hq implements ValueAnimator.AnimatorUpdateListener {
    public final int f38495a;
    public final qq f38496b;

    public hq(qq qqVar, int i10) {
        this.f38495a = i10;
        this.f38496b = qqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38495a) {
            case 0:
                qq qqVar = this.f38496b;
                qqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qqVar.h.invalidateSelf();
                return;
            default:
                qq qqVar2 = this.f38496b;
                qqVar2.getClass();
                qqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = qqVar2.f41397e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
