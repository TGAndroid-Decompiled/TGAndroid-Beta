package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class d61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24307a;
    public int f24308b;
    public final int f24309c;
    public final Object d;

    public d61(org.telegram.ui.iv ivVar, int i10, int i11) {
        this.f24307a = 1;
        this.d = ivVar;
        this.f24308b = i10;
        this.f24309c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24307a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f24309c);
                h61 h61Var = (h61) this.d;
                h61Var.N = true;
                h61Var.f25522n.scrollBy(0, floatValue - this.f24308b);
                h61Var.N = false;
                this.f24308b = floatValue;
                return;
            default:
                ((org.telegram.ui.iv) this.d).f37207c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f24308b, this.f24309c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public d61(h61 h61Var, int i10) {
        this.f24307a = 0;
        this.d = h61Var;
        this.f24309c = i10;
        this.f24308b = 0;
    }
}
