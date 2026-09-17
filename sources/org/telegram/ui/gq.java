package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gq implements ValueAnimator.AnimatorUpdateListener {
    public final int f34024a;
    public final pq f34025b;

    public gq(pq pqVar, int i10) {
        this.f34024a = i10;
        this.f34025b = pqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34024a) {
            case 0:
                pq pqVar = this.f34025b;
                pqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                pqVar.h.invalidateSelf();
                return;
            default:
                pq pqVar2 = this.f34025b;
                pqVar2.getClass();
                pqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = pqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
