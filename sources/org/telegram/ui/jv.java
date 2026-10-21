package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38367a;
    public final cy f38368b;
    public final float f38369c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38367a = i10;
        this.f38368b = cyVar;
        this.f38369c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38367a) {
            case 0:
                cy.V(this.f38368b, this.f38369c, valueAnimator);
                return;
            default:
                cy.C0(this.f38368b, this.f38369c, valueAnimator);
                return;
        }
    }
}
