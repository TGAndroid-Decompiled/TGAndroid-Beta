package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22580a;
    public int f22581b;
    public final int f22582c;
    public final Object d;

    public b51(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.f22580a = 1;
        this.d = fvVar;
        this.f22581b = i10;
        this.f22582c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22580a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f22582c);
                f51 f51Var = (f51) this.d;
                f51Var.N = true;
                f51Var.f23785n.scrollBy(0, floatValue - this.f22581b);
                f51Var.N = false;
                this.f22581b = floatValue;
                return;
            default:
                ((org.telegram.ui.fv) this.d).f33766c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f22581b, this.f22582c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public b51(f51 f51Var, int i10) {
        this.f22580a = 0;
        this.d = f51Var;
        this.f22582c = i10;
        this.f22581b = 0;
    }
}
