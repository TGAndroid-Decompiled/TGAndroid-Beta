package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33076a;
    public int f33077b;
    public final int f33078c;
    public final Object d;

    public z41(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f33076a = 1;
        this.d = evVar;
        this.f33077b = i10;
        this.f33078c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33076a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33078c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.f25234n.scrollBy(0, floatValue - this.f33077b);
                d51Var.N = false;
                this.f33077b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f36185c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33077b, this.f33078c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f33076a = 0;
        this.d = d51Var;
        this.f33078c = i10;
        this.f33077b = 0;
    }
}
