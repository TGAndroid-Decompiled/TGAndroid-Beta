package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30528a;
    public int f30529b;
    public final int f30530c;
    public final Object d;

    public z41(org.telegram.ui.av avVar, int i10, int i11) {
        this.f30528a = 1;
        this.d = avVar;
        this.f30529b = i10;
        this.f30530c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30528a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f30530c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.f23244n.scrollBy(0, floatValue - this.f30529b);
                d51Var.N = false;
                this.f30529b = floatValue;
                return;
            default:
                ((org.telegram.ui.av) this.d).f31890c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f30529b, this.f30530c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.f30528a = 0;
        this.d = d51Var;
        this.f30530c = i10;
        this.f30529b = 0;
    }
}
