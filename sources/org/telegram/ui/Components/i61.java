package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27256a;
    public int f27257b;
    public final int f27258c;
    public final Object d;

    public i61(org.telegram.ui.cv cvVar, int i10, int i11) {
        this.f27256a = 1;
        this.d = cvVar;
        this.f27257b = i10;
        this.f27258c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27256a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f27258c);
                m61 m61Var = (m61) this.d;
                m61Var.N = true;
                m61Var.f28685n.scrollBy(0, floatValue - this.f27257b);
                m61Var.N = false;
                this.f27257b = floatValue;
                return;
            default:
                ((org.telegram.ui.cv) this.d).f36787c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27257b, this.f27258c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public i61(m61 m61Var, int i10) {
        this.f27256a = 0;
        this.d = m61Var;
        this.f27258c = i10;
        this.f27257b = 0;
    }
}
