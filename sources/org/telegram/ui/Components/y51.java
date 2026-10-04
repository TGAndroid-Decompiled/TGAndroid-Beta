package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class y51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33098a;
    public int f33099b;
    public final int f33100c;
    public final Object d;

    public y51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f33098a = 1;
        this.d = dvVar;
        this.f33099b = i10;
        this.f33100c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33098a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33100c);
                c61 c61Var = (c61) this.d;
                c61Var.N = true;
                c61Var.f25237n.scrollBy(0, floatValue - this.f33099b);
                c61Var.N = false;
                this.f33099b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f35847c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33099b, this.f33100c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public y51(c61 c61Var, int i10) {
        this.f33098a = 0;
        this.d = c61Var;
        this.f33100c = i10;
        this.f33099b = 0;
    }
}
