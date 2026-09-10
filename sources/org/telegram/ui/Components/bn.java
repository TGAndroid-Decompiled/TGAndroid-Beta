package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bn implements ValueAnimator.AnimatorUpdateListener {
    public final int f21861a;
    public final zn f21862b;

    public bn(zn znVar, int i10) {
        this.f21861a = i10;
        this.f21862b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21861a) {
            case 0:
                zn znVar = this.f21862b;
                znVar.getClass();
                znVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zn znVar2 = this.f21862b;
                znVar2.getClass();
                znVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
