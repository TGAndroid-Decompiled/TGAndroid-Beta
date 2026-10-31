package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28827a;
    public final jn f28828b;

    public nm(jn jnVar, int i10) {
        this.f28827a = i10;
        this.f28828b = jnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28827a) {
            case 0:
                jn jnVar = this.f28828b;
                jnVar.getClass();
                jnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jn jnVar2 = this.f28828b;
                jnVar2.getClass();
                jnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
