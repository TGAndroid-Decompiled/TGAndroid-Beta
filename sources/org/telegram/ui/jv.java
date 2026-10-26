package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40752a;
    public final cy f40753b;
    public final float f40754c;

    public jv(cy cyVar, float f7, int i10) {
        this.f40752a = i10;
        this.f40753b = cyVar;
        this.f40754c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40752a) {
            case 0:
                cy.W(this.f40753b, this.f40754c, valueAnimator);
                return;
            default:
                cy.D0(this.f40753b, this.f40754c, valueAnimator);
                return;
        }
    }
}
