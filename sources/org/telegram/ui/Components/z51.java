package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32849a;
    public int f32850b;
    public final int f32851c;
    public final Object d;

    public z51(org.telegram.ui.pu puVar, int i10, int i11) {
        this.f32849a = 1;
        this.d = puVar;
        this.f32850b = i10;
        this.f32851c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32849a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f32851c);
                d61 d61Var = (d61) this.d;
                d61Var.N = true;
                d61Var.f25354n.scrollBy(0, floatValue - this.f32850b);
                d61Var.N = false;
                this.f32850b = floatValue;
                return;
            default:
                ((org.telegram.ui.pu) this.d).f40303c.d.setColorFilter(new PorterDuffColorFilter(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32850b, this.f32851c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z51(d61 d61Var, int i10) {
        this.f32849a = 0;
        this.d = d61Var;
        this.f32851c = i10;
        this.f32850b = 0;
    }
}
