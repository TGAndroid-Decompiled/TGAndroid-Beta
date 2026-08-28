package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30481a;
    public final jn f30482b;

    public lm(jn jnVar, int i9) {
        this.f30481a = i9;
        this.f30482b = jnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30481a) {
            case 0:
                jn jnVar = this.f30482b;
                jnVar.getClass();
                jnVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jn jnVar2 = this.f30482b;
                jnVar2.getClass();
                jnVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
