package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f36472a;
    public final org.telegram.ui.ActionBar.k2 f36473b;

    public cj(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36472a = i10;
        this.f36473b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36472a) {
            case 0:
                un unVar = (un) this.f36473b;
                unVar.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.l1.invalidate();
                return;
            case 1:
                ay ayVar = (ay) this.f36473b;
                ayVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ayVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((m91) this.f36473b).f39603y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
