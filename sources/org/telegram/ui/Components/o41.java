package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class o41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31254a;
    public int f31255b;
    public final int f31256c;
    public final Object d;

    public o41(org.telegram.ui.tu tuVar, int i10, int i11) {
        this.f31254a = 1;
        this.d = tuVar;
        this.f31255b = i10;
        this.f31256c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31254a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f31256c);
                s41 s41Var = (s41) this.d;
                s41Var.J = true;
                s41Var.f32485n.scrollBy(0, floatValue - this.f31255b);
                s41Var.J = false;
                this.f31255b = floatValue;
                return;
            default:
                ((org.telegram.ui.tu) this.d).f43098c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f31255b, this.f31256c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public o41(s41 s41Var, int i10) {
        this.f31254a = 0;
        this.d = s41Var;
        this.f31256c = i10;
        this.f31255b = 0;
    }
}
