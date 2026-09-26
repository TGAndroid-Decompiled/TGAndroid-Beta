package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f35858a;
    public final wn f35859b;

    public ne(wn wnVar, int i10) {
        this.f35858a = i10;
        this.f35859b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35858a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f35859b;
                wnVar.K8 = floatValue;
                pm pmVar = wnVar.X0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    wnVar.f39694x0.invalidate();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f35859b;
                wnVar2.getClass();
                wnVar2.f39509i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.lc();
                return;
            case 2:
                wn wnVar3 = this.f35859b;
                wnVar3.getClass();
                wnVar3.f39509i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.lc();
                return;
            case 3:
                wn wnVar4 = this.f35859b;
                wnVar4.getClass();
                wnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.o9();
                return;
            default:
                wn wnVar5 = this.f35859b;
                wnVar5.getClass();
                wnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.o9();
                return;
        }
    }
}
