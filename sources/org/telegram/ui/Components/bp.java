package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33851a = false;
    public final i01 f33852b;
    public final float f33853c;
    public final boolean d;
    public final np f33854e;

    public bp(np npVar, i01 i01Var, float f10, boolean z10) {
        this.f33854e = npVar;
        this.f33852b = i01Var;
        this.f33853c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f33854e;
        npVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f33852b.setRadius(this.f33853c * floatValue);
        if (!this.f33851a && npVar.M1 > 0.5f) {
            this.f33851a = true;
        }
    }
}
