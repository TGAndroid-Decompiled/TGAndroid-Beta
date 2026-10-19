package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38360a;
    public final cy f38361b;
    public final float f38362c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38360a = i10;
        this.f38361b = cyVar;
        this.f38362c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38360a) {
            case 0:
                cy.V(this.f38361b, this.f38362c, valueAnimator);
                return;
            default:
                cy.C0(this.f38361b, this.f38362c, valueAnimator);
                return;
        }
    }
}
