package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class so implements ValueAnimator.AnimatorUpdateListener {
    public boolean f39381a = false;
    public final zz0 f39382b;
    public final float f39383c;
    public final boolean d;
    public final ep f39384e;

    public so(ep epVar, zz0 zz0Var, float f10, boolean z10) {
        this.f39384e = epVar;
        this.f39382b = zz0Var;
        this.f39383c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ep epVar = this.f39384e;
        epVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f39382b.setRadius(this.f39383c * floatValue);
        if (!this.f39381a && epVar.M1 > 0.5f) {
            this.f39381a = true;
        }
    }
}
