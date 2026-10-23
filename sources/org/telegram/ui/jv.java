package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38371a;
    public final cy f38372b;
    public final float f38373c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38371a = i10;
        this.f38372b = cyVar;
        this.f38373c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38371a) {
            case 0:
                cy.V(this.f38372b, this.f38373c, valueAnimator);
                return;
            default:
                cy.C0(this.f38372b, this.f38373c, valueAnimator);
                return;
        }
    }
}
