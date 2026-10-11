package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f37066a;
    public final org.telegram.ui.ActionBar.m2 f37067b;

    public dj(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f37066a = i10;
        this.f37067b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37066a) {
            case 0:
                zn znVar = (zn) this.f37067b;
                znVar.f44880la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                sy syVar = (sy) this.f37067b;
                syVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = syVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((wd1) this.f37067b).f43422x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
