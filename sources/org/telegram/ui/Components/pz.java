package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class pz implements ValueAnimator.AnimatorUpdateListener {

    public final int f31693a;

    public final wz f31694b;

    public pz(wz wzVar, int i10) {
        this.f31693a = i10;
        this.f31694b = wzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31693a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz wzVar = this.f31694b;
                wzVar.f34396x = fFloatValue;
                wzVar.invalidate();
                break;
            default:
                wz wzVar2 = this.f31694b;
                wzVar2.getClass();
                wzVar2.f34397y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wzVar2.invalidate();
                break;
        }
    }
}
