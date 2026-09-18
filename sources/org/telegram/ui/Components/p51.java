package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27109a;
    public int f27110b;
    public final int f27111c;
    public final Object d;

    public p51(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f27109a = 1;
        this.d = evVar;
        this.f27110b = i10;
        this.f27111c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27109a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27111c);
                t51 t51Var = (t51) this.d;
                t51Var.N = true;
                t51Var.f28327n.scrollBy(0, floatValue - this.f27110b);
                t51Var.N = false;
                this.f27110b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f33364c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27110b, this.f27111c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public p51(t51 t51Var, int i10) {
        this.f27109a = 0;
        this.d = t51Var;
        this.f27111c = i10;
        this.f27110b = 0;
    }
}
