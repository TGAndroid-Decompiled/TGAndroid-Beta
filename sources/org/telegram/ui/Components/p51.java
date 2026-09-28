package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27261a;
    public int f27262b;
    public final int f27263c;
    public final Object d;

    public p51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f27261a = 1;
        this.d = zuVar;
        this.f27262b = i10;
        this.f27263c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27261a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27263c);
                t51 t51Var = (t51) this.d;
                t51Var.N = true;
                t51Var.f28472n.scrollBy(0, floatValue - this.f27262b);
                t51Var.N = false;
                this.f27262b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40582c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27262b, this.f27263c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public p51(t51 t51Var, int i10) {
        this.f27261a = 0;
        this.d = t51Var;
        this.f27263c = i10;
        this.f27262b = 0;
    }
}
