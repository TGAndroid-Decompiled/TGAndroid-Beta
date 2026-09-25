package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26650a;
    public int f26651b;
    public final int f26652c;
    public final Object d;

    public n51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f26650a = 1;
        this.d = zuVar;
        this.f26651b = i10;
        this.f26652c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26650a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26652c);
                r51 r51Var = (r51) this.d;
                r51Var.N = true;
                r51Var.f27876n.scrollBy(0, floatValue - this.f26651b);
                r51Var.N = false;
                this.f26651b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40582c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26651b, this.f26652c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public n51(r51 r51Var, int i10) {
        this.f26650a = 0;
        this.d = r51Var;
        this.f26652c = i10;
        this.f26651b = 0;
    }
}
