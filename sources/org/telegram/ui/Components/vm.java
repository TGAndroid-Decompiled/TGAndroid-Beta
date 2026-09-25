package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vm implements ValueAnimator.AnimatorUpdateListener {
    public final int f29180a;
    public final vn f29181b;

    public vm(vn vnVar, int i10) {
        this.f29180a = i10;
        this.f29181b = vnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29180a) {
            case 0:
                vn vnVar = this.f29181b;
                vnVar.getClass();
                vnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vn vnVar2 = this.f29181b;
                vnVar2.getClass();
                vnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
