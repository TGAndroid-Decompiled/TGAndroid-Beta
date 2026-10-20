package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38366a;
    public final cy f38367b;
    public final float f38368c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38366a = i10;
        this.f38367b = cyVar;
        this.f38368c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38366a) {
            case 0:
                cy.V(this.f38367b, this.f38368c, valueAnimator);
                return;
            default:
                cy.C0(this.f38367b, this.f38368c, valueAnimator);
                return;
        }
    }
}
