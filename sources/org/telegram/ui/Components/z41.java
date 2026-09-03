package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33758a;
    public int f33759b;
    public final int f33760c;
    public final Object d;

    public z41(org.telegram.ui.cv cvVar, int i10, int i11) {
        this.f33758a = 1;
        this.d = cvVar;
        this.f33759b = i10;
        this.f33760c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33758a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33760c);
                d51 d51Var = (d51) this.d;
                d51Var.K = true;
                d51Var.f26191n.scrollBy(0, floatValue - this.f33759b);
                d51Var.K = false;
                this.f33759b = floatValue;
                return;
            default:
                ((org.telegram.ui.cv) this.d).f35862c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33759b, this.f33760c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f33758a = 0;
        this.d = d51Var;
        this.f33760c = i10;
        this.f33759b = 0;
    }
}
