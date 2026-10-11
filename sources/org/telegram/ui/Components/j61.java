package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27586a;
    public int f27587b;
    public final int f27588c;
    public final Object d;

    public j61(org.telegram.ui.bv bvVar, int i10, int i11) {
        this.f27586a = 1;
        this.d = bvVar;
        this.f27587b = i10;
        this.f27588c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27586a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27588c);
                n61 n61Var = (n61) this.d;
                n61Var.N = true;
                n61Var.f28981n.scrollBy(0, floatValue - this.f27587b);
                n61Var.N = false;
                this.f27587b = floatValue;
                return;
            default:
                ((org.telegram.ui.bv) this.d).f36462c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27587b, this.f27588c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public j61(n61 n61Var, int i10) {
        this.f27586a = 0;
        this.d = n61Var;
        this.f27588c = i10;
        this.f27587b = 0;
    }
}
