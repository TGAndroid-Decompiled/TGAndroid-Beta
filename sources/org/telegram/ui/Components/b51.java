package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25493a;
    public int f25494b;
    public final int f25495c;
    public final Object d;

    public b51(org.telegram.ui.cv cvVar, int i10, int i11) {
        this.f25493a = 1;
        this.d = cvVar;
        this.f25494b = i10;
        this.f25495c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25493a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f25495c);
                f51 f51Var = (f51) this.d;
                f51Var.K = true;
                f51Var.f26762n.scrollBy(0, floatValue - this.f25494b);
                f51Var.K = false;
                this.f25494b = floatValue;
                return;
            default:
                ((org.telegram.ui.cv) this.d).f35917c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f25494b, this.f25495c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public b51(f51 f51Var, int i10) {
        this.f25493a = 0;
        this.d = f51Var;
        this.f25495c = i10;
        this.f25494b = 0;
    }
}
