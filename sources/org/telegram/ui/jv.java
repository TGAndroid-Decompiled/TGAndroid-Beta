package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40749a;
    public final cy f40750b;
    public final float f40751c;

    public jv(cy cyVar, float f7, int i10) {
        this.f40749a = i10;
        this.f40750b = cyVar;
        this.f40751c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40749a) {
            case 0:
                cy.W(this.f40750b, this.f40751c, valueAnimator);
                return;
            default:
                cy.D0(this.f40750b, this.f40751c, valueAnimator);
                return;
        }
    }
}
