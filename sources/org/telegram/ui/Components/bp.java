package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33897a = false;
    public final i01 f33898b;
    public final float f33899c;
    public final boolean d;
    public final np f33900e;

    public bp(np npVar, i01 i01Var, float f10, boolean z10) {
        this.f33900e = npVar;
        this.f33898b = i01Var;
        this.f33899c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f33900e;
        npVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f33898b.setRadius(this.f33899c * floatValue);
        if (!this.f33897a && npVar.M1 > 0.5f) {
            this.f33897a = true;
        }
    }
}
