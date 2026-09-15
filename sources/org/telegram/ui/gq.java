package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gq implements ValueAnimator.AnimatorUpdateListener {
    public final int f33982a;
    public final pq f33983b;

    public gq(pq pqVar, int i10) {
        this.f33982a = i10;
        this.f33983b = pqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33982a) {
            case 0:
                pq pqVar = this.f33983b;
                pqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                pqVar.h.invalidateSelf();
                return;
            default:
                pq pqVar2 = this.f33983b;
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
