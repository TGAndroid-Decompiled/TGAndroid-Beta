package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gn implements ValueAnimator.AnimatorUpdateListener {
    public final int f28656a;
    public final go f28657b;

    public gn(go goVar, int i10) {
        this.f28656a = i10;
        this.f28657b = goVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28656a) {
            case 0:
                go goVar = this.f28657b;
                goVar.getClass();
                goVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                go goVar2 = this.f28657b;
                goVar2.getClass();
                goVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
