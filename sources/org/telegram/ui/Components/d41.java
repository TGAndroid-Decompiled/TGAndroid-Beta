package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class d41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27651a;
    public int f27652b;
    public final int f27653c;
    public final Object d;

    public d41(org.telegram.ui.su suVar, int i9, int i10) {
        this.f27651a = 1;
        this.d = suVar;
        this.f27652b = i9;
        this.f27653c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27651a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27653c);
                h41 h41Var = (h41) this.d;
                h41Var.J = true;
                h41Var.f28972n.scrollBy(0, floatValue - this.f27652b);
                h41Var.J = false;
                this.f27652b = floatValue;
                return;
            default:
                ((org.telegram.ui.su) this.d).f42768c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27652b, this.f27653c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public d41(h41 h41Var, int i9) {
        this.f27651a = 0;
        this.d = h41Var;
        this.f27653c = i9;
        this.f27652b = 0;
    }
}
