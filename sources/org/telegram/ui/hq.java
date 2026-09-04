package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hq implements ValueAnimator.AnimatorUpdateListener {
    public final int f37090a;
    public final qq f37091b;

    public hq(qq qqVar, int i10) {
        this.f37090a = i10;
        this.f37091b = qqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37090a) {
            case 0:
                qq qqVar = this.f37091b;
                qqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qqVar.h.invalidateSelf();
                return;
            default:
                qq qqVar2 = this.f37091b;
                qqVar2.getClass();
                qqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = qqVar2.f39943e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
