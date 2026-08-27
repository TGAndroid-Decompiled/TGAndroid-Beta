package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public final class f41 implements ValueAnimator.AnimatorUpdateListener {

    public final int f28252a;

    public int f28253b;

    public final int f28254c;
    public final Object d;

    public f41(org.telegram.ui.vu vuVar, int i10, int i11) {
        this.f28252a = 1;
        this.d = vuVar;
        this.f28253b = i10;
        this.f28254c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28252a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f28254c);
                j41 j41Var = (j41) this.d;
                j41Var.J = true;
                j41Var.f29585n.scrollBy(0, iFloatValue - this.f28253b);
                j41Var.J = false;
                this.f28253b = iFloatValue;
                break;
            default:
                ((org.telegram.ui.vu) this.d).f43524c.d.setColorFilter(new PorterDuffColorFilter(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f28253b, this.f28254c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public f41(j41 j41Var, int i10) {
        this.f28252a = 0;
        this.d = j41Var;
        this.f28254c = i10;
        this.f28253b = 0;
    }
}
