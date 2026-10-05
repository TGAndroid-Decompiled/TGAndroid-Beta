package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dq implements ValueAnimator.AnimatorUpdateListener {
    public final int f35867a;
    public final mq f35868b;

    public dq(mq mqVar, int i10) {
        this.f35867a = i10;
        this.f35868b = mqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35867a) {
            case 0:
                mq mqVar = this.f35868b;
                mqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mqVar.h.invalidateSelf();
                return;
            default:
                mq mqVar2 = this.f35868b;
                mqVar2.getClass();
                mqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mqVar2.f38706e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
