package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23296a;
    public int f23297b;
    public final int f23298c;
    public final Object d;

    public a51(org.telegram.ui.bv bvVar, int i10, int i11) {
        this.f23296a = 1;
        this.d = bvVar;
        this.f23297b = i10;
        this.f23298c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23296a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f23298c);
                e51 e51Var = (e51) this.d;
                e51Var.K = true;
                e51Var.f24470n.scrollBy(0, floatValue - this.f23297b);
                e51Var.K = false;
                this.f23297b = floatValue;
                return;
            default:
                ((org.telegram.ui.bv) this.d).f33036c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f23297b, this.f23298c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public a51(e51 e51Var, int i10) {
        this.f23296a = 0;
        this.d = e51Var;
        this.f23298c = i10;
        this.f23297b = 0;
    }
}
