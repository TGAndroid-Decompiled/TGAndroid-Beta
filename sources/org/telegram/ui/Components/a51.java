package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23320a;
    public int f23321b;
    public final int f23322c;
    public final Object d;

    public a51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f23320a = 1;
        this.d = dvVar;
        this.f23321b = i10;
        this.f23322c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23320a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f23322c);
                e51 e51Var = (e51) this.d;
                e51Var.K = true;
                e51Var.f24483n.scrollBy(0, floatValue - this.f23321b);
                e51Var.K = false;
                this.f23321b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f33536c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f23321b, this.f23322c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public a51(e51 e51Var, int i10) {
        this.f23320a = 0;
        this.d = e51Var;
        this.f23322c = i10;
        this.f23321b = 0;
    }
}
