package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27506a;
    public int f27507b;
    public final int f27508c;
    public final Object d;

    public q51(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f27506a = 1;
        this.d = evVar;
        this.f27507b = i10;
        this.f27508c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27506a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27508c);
                u51 u51Var = (u51) this.d;
                u51Var.N = true;
                u51Var.f28671n.scrollBy(0, floatValue - this.f27507b);
                u51Var.N = false;
                this.f27507b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f33433c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27507b, this.f27508c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public q51(u51 u51Var, int i10) {
        this.f27506a = 0;
        this.d = u51Var;
        this.f27508c = i10;
        this.f27507b = 0;
    }
}
