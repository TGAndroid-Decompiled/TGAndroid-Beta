package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dq implements ValueAnimator.AnimatorUpdateListener {
    public final int f35822a;
    public final mq f35823b;

    public dq(mq mqVar, int i10) {
        this.f35822a = i10;
        this.f35823b = mqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35822a) {
            case 0:
                mq mqVar = this.f35823b;
                mqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mqVar.h.invalidateSelf();
                return;
            default:
                mq mqVar2 = this.f35823b;
                mqVar2.getClass();
                mqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mqVar2.f38714e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
