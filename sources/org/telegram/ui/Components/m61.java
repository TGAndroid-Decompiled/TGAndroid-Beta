package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28414a;
    public int f28415b;
    public final int f28416c;
    public final Object d;

    public m61(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.f28414a = 1;
        this.d = fvVar;
        this.f28415b = i10;
        this.f28416c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28414a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f28416c);
                q61 q61Var = (q61) this.d;
                q61Var.N = true;
                q61Var.f29742n.scrollBy(0, floatValue - this.f28415b);
                q61Var.N = false;
                this.f28415b = floatValue;
                return;
            default:
                ((org.telegram.ui.fv) this.d).f37854c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f28415b, this.f28416c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public m61(q61 q61Var, int i10) {
        this.f28414a = 0;
        this.d = q61Var;
        this.f28416c = i10;
        this.f28415b = 0;
    }
}
