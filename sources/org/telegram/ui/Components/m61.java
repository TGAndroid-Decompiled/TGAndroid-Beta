package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28409a;
    public int f28410b;
    public final int f28411c;
    public final Object d;

    public m61(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.f28409a = 1;
        this.d = fvVar;
        this.f28410b = i10;
        this.f28411c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28409a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f28411c);
                q61 q61Var = (q61) this.d;
                q61Var.N = true;
                q61Var.f29720n.scrollBy(0, floatValue - this.f28410b);
                q61Var.N = false;
                this.f28410b = floatValue;
                return;
            default:
                ((org.telegram.ui.fv) this.d).f37852c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f28410b, this.f28411c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public m61(q61 q61Var, int i10) {
        this.f28409a = 0;
        this.d = q61Var;
        this.f28411c = i10;
        this.f28410b = 0;
    }
}
