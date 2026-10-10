package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f37032a;
    public final org.telegram.ui.ActionBar.n2 f37033b;

    public dj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37032a = i10;
        this.f37033b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37032a) {
            case 0:
                zn znVar = (zn) this.f37033b;
                znVar.f44891la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                ty tyVar = (ty) this.f37033b;
                tyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((xd1) this.f37033b).f44044x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
