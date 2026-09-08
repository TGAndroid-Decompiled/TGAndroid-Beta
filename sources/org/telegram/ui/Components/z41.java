package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33103a;
    public int f33104b;
    public final int f33105c;
    public final Object d;

    public z41(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f33103a = 1;
        this.d = evVar;
        this.f33104b = i10;
        this.f33105c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33103a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33105c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.f25261n.scrollBy(0, floatValue - this.f33104b);
                d51Var.N = false;
                this.f33104b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f36212c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33104b, this.f33105c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f33103a = 0;
        this.d = d51Var;
        this.f33105c = i10;
        this.f33104b = 0;
    }
}
