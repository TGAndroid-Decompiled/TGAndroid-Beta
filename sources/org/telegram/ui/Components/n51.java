package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26642a;
    public int f26643b;
    public final int f26644c;
    public final Object d;

    public n51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.f26642a = 1;
        this.d = zuVar;
        this.f26643b = i10;
        this.f26644c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26642a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26644c);
                r51 r51Var = (r51) this.d;
                r51Var.N = true;
                r51Var.f27867n.scrollBy(0, floatValue - this.f26643b);
                r51Var.N = false;
                this.f26643b = floatValue;
                return;
            default:
                ((org.telegram.ui.zu) this.d).f40567c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26643b, this.f26644c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public n51(r51 r51Var, int i10) {
        this.f26642a = 0;
        this.d = r51Var;
        this.f26644c = i10;
        this.f26643b = 0;
    }
}
