package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f28429a;
    public final un f28430b;

    public um(un unVar, int i10) {
        this.f28429a = i10;
        this.f28430b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28429a) {
            case 0:
                un unVar = this.f28430b;
                unVar.getClass();
                unVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                un unVar2 = this.f28430b;
                unVar2.getClass();
                unVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
