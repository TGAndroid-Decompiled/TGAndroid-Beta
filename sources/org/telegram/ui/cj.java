package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f35126a;
    public final org.telegram.ui.ActionBar.n2 f35127b;

    public cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35126a = i10;
        this.f35127b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35126a) {
            case 0:
                co coVar = (co) this.f35127b;
                coVar.f35332la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f35127b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((wd1) this.f35127b).f41978x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
