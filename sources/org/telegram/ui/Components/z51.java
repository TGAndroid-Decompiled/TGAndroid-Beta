package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32850a;
    public int f32851b;
    public final int f32852c;
    public final Object d;

    public z51(org.telegram.ui.pu puVar, int i10, int i11) {
        this.f32850a = 1;
        this.d = puVar;
        this.f32851b = i10;
        this.f32852c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32850a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f32852c);
                d61 d61Var = (d61) this.d;
                d61Var.N = true;
                d61Var.f25355n.scrollBy(0, floatValue - this.f32851b);
                d61Var.N = false;
                this.f32851b = floatValue;
                return;
            default:
                ((org.telegram.ui.pu) this.d).f40304c.d.setColorFilter(new PorterDuffColorFilter(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32851b, this.f32852c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z51(d61 d61Var, int i10) {
        this.f32850a = 0;
        this.d = d61Var;
        this.f32852c = i10;
        this.f32851b = 0;
    }
}
