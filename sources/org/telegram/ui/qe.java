package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qe implements ValueAnimator.AnimatorUpdateListener {
    public final int f48866a;
    public final wm f48867b;
    public final View f48868c;

    public qe(wm wmVar, org.telegram.ui.Cells.t0 t0Var, int i3) {
        this.f48866a = i3;
        this.f48867b = wmVar;
        this.f48868c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48866a) {
            case 0:
                wm wmVar = this.f48867b;
                wmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.U9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                wmVar.K9();
                this.f48868c.setAlpha(floatValue);
                return;
            default:
                wm wmVar2 = this.f48867b;
                wmVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.U9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                wmVar2.K9();
                wmVar2.M9();
                this.f48868c.setAlpha(floatValue2);
                return;
        }
    }
}
