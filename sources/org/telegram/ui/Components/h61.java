package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class h61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26980a;
    public int f26981b;
    public final int f26982c;
    public final Object d;

    public h61(org.telegram.ui.cv cvVar, int i10, int i11) {
        this.f26980a = 1;
        this.d = cvVar;
        this.f26981b = i10;
        this.f26982c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26980a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26982c);
                l61 l61Var = (l61) this.d;
                l61Var.N = true;
                l61Var.f28308n.scrollBy(0, floatValue - this.f26981b);
                l61Var.N = false;
                this.f26981b = floatValue;
                return;
            default:
                ((org.telegram.ui.cv) this.d).f36743c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26981b, this.f26982c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public h61(l61 l61Var, int i10) {
        this.f26980a = 0;
        this.d = l61Var;
        this.f26982c = i10;
        this.f26981b = 0;
    }
}
