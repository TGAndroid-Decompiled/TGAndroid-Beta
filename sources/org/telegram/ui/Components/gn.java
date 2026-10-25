package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gn implements ValueAnimator.AnimatorUpdateListener {
    public final int f28602a;
    public final go f28603b;

    public gn(go goVar, int i10) {
        this.f28602a = i10;
        this.f28603b = goVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28602a) {
            case 0:
                go goVar = this.f28603b;
                goVar.getClass();
                goVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                go goVar2 = this.f28603b;
                goVar2.getClass();
                goVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
