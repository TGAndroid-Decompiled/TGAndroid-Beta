package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dq implements ValueAnimator.AnimatorUpdateListener {
    public final int f35828a;
    public final mq f35829b;

    public dq(mq mqVar, int i10) {
        this.f35828a = i10;
        this.f35829b = mqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35828a) {
            case 0:
                mq mqVar = this.f35829b;
                mqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mqVar.h.invalidateSelf();
                return;
            default:
                mq mqVar2 = this.f35829b;
                mqVar2.getClass();
                mqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mqVar2.f38720e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
