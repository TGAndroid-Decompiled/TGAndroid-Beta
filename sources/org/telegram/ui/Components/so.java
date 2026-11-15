package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class so implements ValueAnimator.AnimatorUpdateListener {
    public boolean f39383a = false;
    public final zz0 f39384b;
    public final float f39385c;
    public final boolean d;
    public final ep f39386e;

    public so(ep epVar, zz0 zz0Var, float f10, boolean z10) {
        this.f39386e = epVar;
        this.f39384b = zz0Var;
        this.f39385c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ep epVar = this.f39386e;
        epVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f39384b.setRadius(this.f39385c * floatValue);
        if (!this.f39383a && epVar.M1 > 0.5f) {
            this.f39383a = true;
        }
    }
}
