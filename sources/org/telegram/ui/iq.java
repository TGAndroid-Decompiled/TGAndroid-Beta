package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class iq implements ValueAnimator.AnimatorUpdateListener {
    public final int f33780a;
    public final rq f33781b;

    public iq(rq rqVar, int i10) {
        this.f33780a = i10;
        this.f33781b = rqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33780a) {
            case 0:
                rq rqVar = this.f33781b;
                rqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rqVar.h.invalidateSelf();
                return;
            default:
                rq rqVar2 = this.f33781b;
                rqVar2.getClass();
                rqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = rqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
