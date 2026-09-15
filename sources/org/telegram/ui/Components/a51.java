package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22314a;
    public int f22315b;
    public final int f22316c;
    public final Object d;

    public a51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f22314a = 1;
        this.d = dvVar;
        this.f22315b = i10;
        this.f22316c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22314a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f22316c);
                e51 e51Var = (e51) this.d;
                e51Var.N = true;
                e51Var.f23546n.scrollBy(0, floatValue - this.f22315b);
                e51Var.N = false;
                this.f22315b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f33133c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f22315b, this.f22316c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public a51(e51 e51Var, int i10) {
        this.f22314a = 0;
        this.d = e51Var;
        this.f22316c = i10;
        this.f22315b = 0;
    }
}
