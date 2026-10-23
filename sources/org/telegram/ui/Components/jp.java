package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f27732a = false;
    public final t21 f27733b;
    public final float f27734c;
    public final boolean d;
    public final wp e;

    public jp(wp wpVar, t21 t21Var, float f7, boolean z10) {
        this.e = wpVar;
        this.f27733b = t21Var;
        this.f27734c = f7;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wp wpVar = this.e;
        wpVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f27733b.setRadius(this.f27734c * floatValue);
        if (!this.f27732a && wpVar.R > 0.5f) {
            this.f27732a = true;
        }
    }
}
