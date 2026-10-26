package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30238a = false;
    public final b31 f30239b;
    public final float f30240c;
    public final boolean d;
    public final yp e;

    public lp(yp ypVar, b31 b31Var, float f7, boolean z10) {
        this.e = ypVar;
        this.f30239b = b31Var;
        this.f30240c = f7;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yp ypVar = this.e;
        ypVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f30239b.setRadius(this.f30240c * floatValue);
        if (!this.f30238a && ypVar.R > 0.5f) {
            this.f30238a = true;
        }
    }
}
