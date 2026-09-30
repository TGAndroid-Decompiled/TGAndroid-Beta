package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27262a;
    public int f27263b;
    public final int f27264c;
    public final Object d;

    public p51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f27262a = 1;
        this.d = zuVar;
        this.f27263b = i10;
        this.f27264c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27262a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27264c);
                t51 t51Var = (t51) this.d;
                t51Var.N = true;
                t51Var.f28470n.scrollBy(0, floatValue - this.f27263b);
                t51Var.N = false;
                this.f27263b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40583c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27263b, this.f27264c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public p51(t51 t51Var, int i10) {
        this.f27262a = 0;
        this.d = t51Var;
        this.f27264c = i10;
        this.f27263b = 0;
    }
}
