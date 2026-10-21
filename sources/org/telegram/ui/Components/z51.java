package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32846a;
    public int f32847b;
    public final int f32848c;
    public final Object d;

    public z51(org.telegram.ui.pu puVar, int i10, int i11) {
        this.f32846a = 1;
        this.d = puVar;
        this.f32847b = i10;
        this.f32848c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32846a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f32848c);
                d61 d61Var = (d61) this.d;
                d61Var.N = true;
                d61Var.f25351n.scrollBy(0, floatValue - this.f32847b);
                d61Var.N = false;
                this.f32847b = floatValue;
                return;
            default:
                ((org.telegram.ui.pu) this.d).f40300c.d.setColorFilter(new PorterDuffColorFilter(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32847b, this.f32848c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public z51(d61 d61Var, int i10) {
        this.f32846a = 0;
        this.d = d61Var;
        this.f32848c = i10;
        this.f32847b = 0;
    }
}
