package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f35125a;
    public final org.telegram.ui.ActionBar.n2 f35126b;

    public cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35125a = i10;
        this.f35126b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35125a) {
            case 0:
                co coVar = (co) this.f35126b;
                coVar.f35331la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f35126b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((wd1) this.f35126b).f41977x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
