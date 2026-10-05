package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class aj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34887a;
    public final org.telegram.ui.ActionBar.n2 f34888b;

    public aj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34887a = i10;
        this.f34888b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34887a) {
            case 0:
                yn ynVar = (yn) this.f34888b;
                ynVar.f43386ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.V0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f34888b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((pd1) this.f34888b).f39550x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
