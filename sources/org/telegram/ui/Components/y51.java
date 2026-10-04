package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class y51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33091a;
    public int f33092b;
    public final int f33093c;
    public final Object d;

    public y51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.f33091a = 1;
        this.d = dvVar;
        this.f33092b = i10;
        this.f33093c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33091a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f33093c);
                c61 c61Var = (c61) this.d;
                c61Var.N = true;
                c61Var.f25231n.scrollBy(0, floatValue - this.f33092b);
                c61Var.N = false;
                this.f33092b = floatValue;
                return;
            default:
                ((org.telegram.ui.dv) this.d).f35841c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f33092b, this.f33093c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public y51(c61 c61Var, int i10) {
        this.f33091a = 0;
        this.d = c61Var;
        this.f33093c = i10;
        this.f33092b = 0;
    }
}
