package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class y51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33092a;
    public int f33093b;
    public final int f33094c;
    public final Object d;

    public y51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f33092a = 1;
        this.d = dvVar;
        this.f33093b = i10;
        this.f33094c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33092a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33094c);
                c61 c61Var = (c61) this.d;
                c61Var.N = true;
                c61Var.f25232n.scrollBy(0, floatValue - this.f33093b);
                c61Var.N = false;
                this.f33093b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f35842c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33093b, this.f33094c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public y51(c61 c61Var, int i10) {
        this.f33092a = 0;
        this.d = c61Var;
        this.f33094c = i10;
        this.f33093b = 0;
    }
}
