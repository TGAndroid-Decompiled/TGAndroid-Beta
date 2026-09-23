package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28771a;
    public final vn f28772b;

    public vm(vn vnVar, int i10) {
        this.f28771a = i10;
        this.f28772b = vnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28771a) {
            case 0:
                vn vnVar = this.f28772b;
                vnVar.getClass();
                vnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vn vnVar2 = this.f28772b;
                vnVar2.getClass();
                vnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
