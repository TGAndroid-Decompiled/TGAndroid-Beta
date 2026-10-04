package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class aj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34831a;
    public final org.telegram.ui.ActionBar.n2 f34832b;

    public aj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34831a = i10;
        this.f34832b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34831a) {
            case 0:
                yn ynVar = (yn) this.f34832b;
                ynVar.f43385ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.V0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f34832b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((rd1) this.f34832b).f40094x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
