package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22577a;
    public int f22578b;
    public final int f22579c;
    public final Object d;

    public b51(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.f22577a = 1;
        this.d = fvVar;
        this.f22578b = i10;
        this.f22579c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22577a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f22579c);
                f51 f51Var = (f51) this.d;
                f51Var.N = true;
                f51Var.f23782n.scrollBy(0, floatValue - this.f22578b);
                f51Var.N = false;
                this.f22578b = floatValue;
                return;
            default:
                ((org.telegram.ui.fv) this.d).f33762c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f22578b, this.f22579c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public b51(f51 f51Var, int i10) {
        this.f22577a = 0;
        this.d = f51Var;
        this.f22579c = i10;
        this.f22578b = 0;
    }
}
