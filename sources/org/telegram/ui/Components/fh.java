package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24286a;
    public final wi f24287b;

    public fh(wi wiVar, int i10) {
        this.f24286a = i10;
        this.f24287b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24286a) {
            case 0:
                this.f24287b.Y1();
                return;
            case 1:
                this.f24287b.D0.invalidate();
                return;
            case 2:
                wi.q(this.f24287b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24287b;
                wiVar.getClass();
                wiVar.H1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24287b.Y1();
                return;
        }
    }
}
