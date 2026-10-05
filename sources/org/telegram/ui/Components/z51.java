package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33432a;
    public int f33433b;
    public final int f33434c;
    public final Object d;

    public z51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f33432a = 1;
        this.d = dvVar;
        this.f33433b = i10;
        this.f33434c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33432a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33434c);
                d61 d61Var = (d61) this.d;
                d61Var.N = true;
                d61Var.f25688n.scrollBy(0, floatValue - this.f33433b);
                d61Var.N = false;
                this.f33433b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f35886c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33433b, this.f33434c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z51(d61 d61Var, int i10) {
        this.f33432a = 0;
        this.d = d61Var;
        this.f33434c = i10;
        this.f33433b = 0;
    }
}
