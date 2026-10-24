package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f27095a = false;
    public final s21 f27096b;
    public final float f27097c;
    public final boolean d;
    public final up e;

    public hp(up upVar, s21 s21Var, float f7, boolean z10) {
        this.e = upVar;
        this.f27096b = s21Var;
        this.f27097c = f7;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        up upVar = this.e;
        upVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f27096b.setRadius(this.f27097c * floatValue);
        if (!this.f27095a && upVar.R > 0.5f) {
            this.f27095a = true;
        }
    }
}
