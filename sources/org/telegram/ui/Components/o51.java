package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26958a;
    public int f26959b;
    public final int f26960c;
    public final Object d;

    public o51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f26958a = 1;
        this.d = zuVar;
        this.f26959b = i10;
        this.f26960c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26958a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26960c);
                s51 s51Var = (s51) this.d;
                s51Var.N = true;
                s51Var.f28164n.scrollBy(0, floatValue - this.f26959b);
                s51Var.N = false;
                this.f26959b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40580c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26959b, this.f26960c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public o51(s51 s51Var, int i10) {
        this.f26958a = 0;
        this.d = s51Var;
        this.f26960c = i10;
        this.f26959b = 0;
    }
}
