package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25421a;
    public int f25422b;
    public final int f25423c;
    public final Object d;

    public n51(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.f25421a = 1;
        this.d = fvVar;
        this.f25422b = i10;
        this.f25423c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25421a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f25423c);
                r51 r51Var = (r51) this.d;
                r51Var.N = true;
                r51Var.f26593n.scrollBy(0, floatValue - this.f25422b);
                r51Var.N = false;
                this.f25422b = floatValue;
                return;
            default:
                ((org.telegram.ui.fv) this.d).f32923c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f25422b, this.f25423c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public n51(r51 r51Var, int i10) {
        this.f25421a = 0;
        this.d = r51Var;
        this.f25423c = i10;
        this.f25422b = 0;
    }
}
