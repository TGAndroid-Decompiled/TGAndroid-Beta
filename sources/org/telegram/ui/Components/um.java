package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f28702a;
    public final un f28703b;

    public um(un unVar, int i10) {
        this.f28702a = i10;
        this.f28703b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28702a) {
            case 0:
                un unVar = this.f28703b;
                unVar.getClass();
                unVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                un unVar2 = this.f28703b;
                unVar2.getClass();
                unVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
