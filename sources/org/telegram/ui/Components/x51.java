package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class x51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32325a;
    public int f32326b;
    public final int f32327c;
    public final Object d;

    public x51(org.telegram.ui.ru ruVar, int i10, int i11) {
        this.f32325a = 1;
        this.d = ruVar;
        this.f32326b = i10;
        this.f32327c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32325a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f32327c);
                b61 b61Var = (b61) this.d;
                b61Var.N = true;
                b61Var.f24816n.scrollBy(0, floatValue - this.f32326b);
                b61Var.N = false;
                this.f32326b = floatValue;
                return;
            default:
                ((org.telegram.ui.ru) this.d).f40814c.d.setColorFilter(new PorterDuffColorFilter(i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32326b, this.f32327c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public x51(b61 b61Var, int i10) {
        this.f32325a = 0;
        this.d = b61Var;
        this.f32327c = i10;
        this.f32326b = 0;
    }
}
