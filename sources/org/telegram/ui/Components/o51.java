package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26813a;
    public int f26814b;
    public final int f26815c;
    public final Object d;

    public o51(org.telegram.ui.ev evVar, int i10, int i11) {
        this.f26813a = 1;
        this.d = evVar;
        this.f26814b = i10;
        this.f26815c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26813a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f26815c);
                s51 s51Var = (s51) this.d;
                s51Var.N = true;
                s51Var.f28056n.scrollBy(0, floatValue - this.f26814b);
                s51Var.N = false;
                this.f26814b = floatValue;
                return;
            default:
                ((org.telegram.ui.ev) this.d).f33408c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26814b, this.f26815c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public o51(s51 s51Var, int i10) {
        this.f26813a = 0;
        this.d = s51Var;
        this.f26815c = i10;
        this.f26814b = 0;
    }
}
