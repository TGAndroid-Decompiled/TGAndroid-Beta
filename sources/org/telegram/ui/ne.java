package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f41780a;
    public final wn f41781b;

    public ne(wn wnVar, int i10) {
        this.f41780a = i10;
        this.f41781b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41780a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f41781b;
                wnVar.f45053a9 = floatValue;
                om omVar = wnVar.f45163j1;
                if (omVar != null) {
                    omVar.invalidate();
                    wnVar.f45339x0.invalidate();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f41781b;
                wnVar2.getClass();
                wnVar2.f45302u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.Cc();
                return;
            case 2:
                wn wnVar3 = this.f41781b;
                wnVar3.getClass();
                wnVar3.f45302u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.Cc();
                return;
            case 3:
                wn wnVar4 = this.f41781b;
                wnVar4.getClass();
                wnVar4.Ua = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.A9();
                return;
            default:
                wn wnVar5 = this.f41781b;
                wnVar5.getClass();
                wnVar5.Ua = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.A9();
                return;
        }
    }
}
