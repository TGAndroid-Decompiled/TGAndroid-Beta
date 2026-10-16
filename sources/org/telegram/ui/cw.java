package org.telegram.ui;

import android.animation.ValueAnimator;
public final class cw implements ValueAnimator.AnimatorUpdateListener {
    public final int f34800a;
    public final yy f34801b;
    public final float f34802c;

    public cw(yy yyVar, float f7, int i10) {
        this.f34800a = i10;
        this.f34801b = yyVar;
        this.f34802c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34800a) {
            case 0:
                yy.V(this.f34801b, this.f34802c, valueAnimator);
                return;
            default:
                yy.C0(this.f34801b, this.f34802c, valueAnimator);
                return;
        }
    }
}
