package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27571a;
    public int f27572b;
    public final int f27573c;
    public final Object d;

    public q51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f27571a = 1;
        this.d = zuVar;
        this.f27572b = i10;
        this.f27573c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27571a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27573c);
                u51 u51Var = (u51) this.d;
                u51Var.N = true;
                u51Var.f28767n.scrollBy(0, floatValue - this.f27572b);
                u51Var.N = false;
                this.f27572b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40680c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27572b, this.f27573c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public q51(u51 u51Var, int i10) {
        this.f27571a = 0;
        this.d = u51Var;
        this.f27573c = i10;
        this.f27572b = 0;
    }
}
