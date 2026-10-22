package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38370a;
    public final cy f38371b;
    public final float f38372c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38370a = i10;
        this.f38371b = cyVar;
        this.f38372c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38370a) {
            case 0:
                cy.V(this.f38371b, this.f38372c, valueAnimator);
                return;
            default:
                cy.C0(this.f38371b, this.f38372c, valueAnimator);
                return;
        }
    }
}
