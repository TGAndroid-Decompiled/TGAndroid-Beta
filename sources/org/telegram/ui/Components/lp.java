package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30236a = false;
    public final b31 f30237b;
    public final float f30238c;
    public final boolean d;
    public final yp e;

    public lp(yp ypVar, b31 b31Var, float f7, boolean z10) {
        this.e = ypVar;
        this.f30237b = b31Var;
        this.f30238c = f7;
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
        this.f30237b.setRadius(this.f30238c * floatValue);
        if (!this.f30236a && ypVar.R > 0.5f) {
            this.f30236a = true;
        }
    }
}
