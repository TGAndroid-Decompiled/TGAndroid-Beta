package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33890a = false;
    public final i01 f33891b;
    public final float f33892c;
    public final boolean d;
    public final np f33893e;

    public bp(np npVar, i01 i01Var, float f10, boolean z10) {
        this.f33893e = npVar;
        this.f33891b = i01Var;
        this.f33892c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f33893e;
        npVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f33891b.setRadius(this.f33892c * floatValue);
        if (!this.f33890a && npVar.M1 > 0.5f) {
            this.f33890a = true;
        }
    }
}
