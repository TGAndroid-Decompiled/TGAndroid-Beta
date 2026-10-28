package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30570a = false;
    public final c31 f30571b;
    public final float f30572c;
    public final boolean d;
    public final zp e;

    public mp(zp zpVar, c31 c31Var, float f7, boolean z10) {
        this.e = zpVar;
        this.f30571b = c31Var;
        this.f30572c = f7;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zp zpVar = this.e;
        zpVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f30571b.setRadius(this.f30572c * floatValue);
        if (!this.f30570a && zpVar.R > 0.5f) {
            this.f30570a = true;
        }
    }
}
