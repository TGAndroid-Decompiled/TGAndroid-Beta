package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26649a;
    public int f26650b;
    public final int f26651c;
    public final Object d;

    public n51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f26649a = 1;
        this.d = zuVar;
        this.f26650b = i10;
        this.f26651c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26649a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26651c);
                r51 r51Var = (r51) this.d;
                r51Var.N = true;
                r51Var.f27875n.scrollBy(0, floatValue - this.f26650b);
                r51Var.N = false;
                this.f26650b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40581c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26650b, this.f26651c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public n51(r51 r51Var, int i10) {
        this.f26649a = 0;
        this.d = r51Var;
        this.f26651c = i10;
        this.f26650b = 0;
    }
}
