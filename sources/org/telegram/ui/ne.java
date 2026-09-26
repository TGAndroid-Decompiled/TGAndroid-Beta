package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f35859a;
    public final wn f35860b;

    public ne(wn wnVar, int i10) {
        this.f35859a = i10;
        this.f35860b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35859a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f35860b;
                wnVar.K8 = floatValue;
                pm pmVar = wnVar.X0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    wnVar.f39695x0.invalidate();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f35860b;
                wnVar2.getClass();
                wnVar2.f39510i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.lc();
                return;
            case 2:
                wn wnVar3 = this.f35860b;
                wnVar3.getClass();
                wnVar3.f39510i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.lc();
                return;
            case 3:
                wn wnVar4 = this.f35860b;
                wnVar4.getClass();
                wnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.o9();
                return;
            default:
                wn wnVar5 = this.f35860b;
                wnVar5.getClass();
                wnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.o9();
                return;
        }
    }
}
