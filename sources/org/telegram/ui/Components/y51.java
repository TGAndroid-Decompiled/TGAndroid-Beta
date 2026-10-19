package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class y51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32554a;
    public int f32555b;
    public final int f32556c;
    public final Object d;

    public y51(org.telegram.ui.pu puVar, int i10, int i11) {
        this.f32554a = 1;
        this.d = puVar;
        this.f32555b = i10;
        this.f32556c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32554a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f32556c);
                c61 c61Var = (c61) this.d;
                c61Var.N = true;
                c61Var.f25092n.scrollBy(0, floatValue - this.f32555b);
                c61Var.N = false;
                this.f32555b = floatValue;
                return;
            default:
                ((org.telegram.ui.pu) this.d).f40294c.d.setColorFilter(new PorterDuffColorFilter(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32555b, this.f32556c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public y51(c61 c61Var, int i10) {
        this.f32554a = 0;
        this.d = c61Var;
        this.f32556c = i10;
        this.f32555b = 0;
    }
}
