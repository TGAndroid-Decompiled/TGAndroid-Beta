package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38359a;
    public final cy f38360b;
    public final float f38361c;

    public jv(cy cyVar, float f7, int i10) {
        this.f38359a = i10;
        this.f38360b = cyVar;
        this.f38361c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38359a) {
            case 0:
                cy.V(this.f38360b, this.f38361c, valueAnimator);
                return;
            default:
                cy.C0(this.f38360b, this.f38361c, valueAnimator);
                return;
        }
    }
}
