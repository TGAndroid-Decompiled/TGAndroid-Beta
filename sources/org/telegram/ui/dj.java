package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f37032a;
    public final org.telegram.ui.ActionBar.m2 f37033b;

    public dj(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f37032a = i10;
        this.f37033b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37032a) {
            case 0:
                zn znVar = (zn) this.f37033b;
                znVar.f44846la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                sy syVar = (sy) this.f37033b;
                syVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = syVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((wd1) this.f37033b).f43388x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
