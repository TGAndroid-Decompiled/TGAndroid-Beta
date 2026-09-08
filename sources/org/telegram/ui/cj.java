package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f35152a;
    public final org.telegram.ui.ActionBar.n2 f35153b;

    public cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35152a = i10;
        this.f35153b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35152a) {
            case 0:
                co coVar = (co) this.f35153b;
                coVar.f35358la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f35153b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((wd1) this.f35153b).f42004x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
