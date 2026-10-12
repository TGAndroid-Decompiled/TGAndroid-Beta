package org.telegram.ui;

import android.animation.ValueAnimator;
public final class cw implements ValueAnimator.AnimatorUpdateListener {
    public final int f35080a;
    public final yy f35081b;
    public final float f35082c;

    public cw(yy yyVar, float f7, int i10) {
        this.f35080a = i10;
        this.f35081b = yyVar;
        this.f35082c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35080a) {
            case 0:
                yy.V(this.f35081b, this.f35082c, valueAnimator);
                return;
            default:
                yy.B0(this.f35081b, this.f35082c, valueAnimator);
                return;
        }
    }
}
