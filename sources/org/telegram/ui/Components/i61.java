package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27346a;
    public int f27347b;
    public final int f27348c;
    public final Object d;

    public i61(org.telegram.ui.bv bvVar, int i10, int i11) {
        this.f27346a = 1;
        this.d = bvVar;
        this.f27347b = i10;
        this.f27348c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27346a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27348c);
                m61 m61Var = (m61) this.d;
                m61Var.N = true;
                m61Var.f28761n.scrollBy(0, floatValue - this.f27347b);
                m61Var.N = false;
                this.f27347b = floatValue;
                return;
            default:
                ((org.telegram.ui.bv) this.d).f36496c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27347b, this.f27348c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public i61(m61 m61Var, int i10) {
        this.f27346a = 0;
        this.d = m61Var;
        this.f27348c = i10;
        this.f27347b = 0;
    }
}
