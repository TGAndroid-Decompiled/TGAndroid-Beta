package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33077a;
    public int f33078b;
    public final int f33079c;
    public final Object d;

    public z41(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f33077a = 1;
        this.d = evVar;
        this.f33078b = i10;
        this.f33079c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33077a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33079c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.f25235n.scrollBy(0, floatValue - this.f33078b);
                d51Var.N = false;
                this.f33078b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f36186c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33078b, this.f33079c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f33077a = 0;
        this.d = d51Var;
        this.f33079c = i10;
        this.f33078b = 0;
    }
}
