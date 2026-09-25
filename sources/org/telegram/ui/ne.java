package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f35860a;
    public final wn f35861b;

    public ne(wn wnVar, int i10) {
        this.f35860a = i10;
        this.f35861b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35860a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f35861b;
                wnVar.K8 = floatValue;
                pm pmVar = wnVar.X0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    wnVar.f39696x0.invalidate();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f35861b;
                wnVar2.getClass();
                wnVar2.f39511i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.lc();
                return;
            case 2:
                wn wnVar3 = this.f35861b;
                wnVar3.getClass();
                wnVar3.f39511i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.lc();
                return;
            case 3:
                wn wnVar4 = this.f35861b;
                wnVar4.getClass();
                wnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.o9();
                return;
            default:
                wn wnVar5 = this.f35861b;
                wnVar5.getClass();
                wnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.o9();
                return;
        }
    }
}
