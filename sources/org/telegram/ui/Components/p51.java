package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27284a;
    public int f27285b;
    public final int f27286c;
    public final Object d;

    public p51(org.telegram.ui.bv bvVar, int i10, int i11) {
        this.f27284a = 1;
        this.d = bvVar;
        this.f27285b = i10;
        this.f27286c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27284a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27286c);
                t51 t51Var = (t51) this.d;
                t51Var.N = true;
                t51Var.f28488n.scrollBy(0, floatValue - this.f27285b);
                t51Var.N = false;
                this.f27285b = floatValue;
                return;
            default:
                ((org.telegram.ui.bv) this.d).f32444c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27285b, this.f27286c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public p51(t51 t51Var, int i10) {
        this.f27284a = 0;
        this.d = t51Var;
        this.f27286c = i10;
        this.f27285b = 0;
    }
}
