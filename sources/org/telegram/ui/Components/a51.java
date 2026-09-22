package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22311a;
    public int f22312b;
    public final int f22313c;
    public final Object d;

    public a51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f22311a = 1;
        this.d = dvVar;
        this.f22312b = i10;
        this.f22313c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22311a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f22313c);
                e51 e51Var = (e51) this.d;
                e51Var.N = true;
                e51Var.f23543n.scrollBy(0, floatValue - this.f22312b);
                e51Var.N = false;
                this.f22312b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f33095c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f22312b, this.f22313c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public a51(e51 e51Var, int i10) {
        this.f22311a = 0;
        this.d = e51Var;
        this.f22313c = i10;
        this.f22312b = 0;
    }
}
