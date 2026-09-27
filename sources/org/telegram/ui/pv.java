package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv implements ValueAnimator.AnimatorUpdateListener {
    public final int f36552a;
    public final ty f36553b;

    public pv(ty tyVar, int i10) {
        this.f36552a = i10;
        this.f36553b = tyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36552a) {
            case 0:
                ty tyVar = this.f36553b;
                tyVar.getClass();
                tyVar.I4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36553b.M4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ty tyVar2 = this.f36553b;
                tyVar2.getClass();
                tyVar2.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
