package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class kq implements ValueAnimator.AnimatorUpdateListener {
    public final int f37483a;
    public final tq f37484b;

    public kq(tq tqVar, int i10) {
        this.f37483a = i10;
        this.f37484b = tqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37483a) {
            case 0:
                tq tqVar = this.f37484b;
                tqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                tqVar.h.invalidateSelf();
                return;
            default:
                tq tqVar2 = this.f37484b;
                tqVar2.getClass();
                tqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = tqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
