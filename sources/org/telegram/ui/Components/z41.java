package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33104a;
    public int f33105b;
    public final int f33106c;
    public final Object d;

    public z41(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f33104a = 1;
        this.d = evVar;
        this.f33105b = i10;
        this.f33106c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33104a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33106c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.f25262n.scrollBy(0, floatValue - this.f33105b);
                d51Var.N = false;
                this.f33105b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f36213c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33105b, this.f33106c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f33104a = 0;
        this.d = d51Var;
        this.f33106c = i10;
        this.f33105b = 0;
    }
}
