package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f37635a;
    public final jn f37636b;

    public nm(jn jnVar, int i7) {
        this.f37635a = i7;
        this.f37636b = jnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37635a) {
            case 0:
                jn jnVar = this.f37636b;
                jnVar.getClass();
                jnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jn jnVar2 = this.f37636b;
                jnVar2.getClass();
                jnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
