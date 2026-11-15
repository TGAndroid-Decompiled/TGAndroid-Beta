package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f37624a;
    public final jn f37625b;

    public nm(jn jnVar, int i7) {
        this.f37624a = i7;
        this.f37625b = jnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37624a) {
            case 0:
                jn jnVar = this.f37625b;
                jnVar.getClass();
                jnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jn jnVar2 = this.f37625b;
                jnVar2.getClass();
                jnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
