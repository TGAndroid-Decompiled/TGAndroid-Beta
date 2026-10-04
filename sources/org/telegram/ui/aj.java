package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class aj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34837a;
    public final org.telegram.ui.ActionBar.n2 f34838b;

    public aj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34837a = i10;
        this.f34838b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34837a) {
            case 0:
                yn ynVar = (yn) this.f34838b;
                ynVar.f43393ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.V0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f34838b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((rd1) this.f34838b).f40100x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
