package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f36327a;
    public final org.telegram.ui.ActionBar.k2 f36328b;

    public cj(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36327a = i10;
        this.f36328b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36327a) {
            case 0:
                un unVar = (un) this.f36328b;
                unVar.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.l1.invalidate();
                return;
            case 1:
                zx zxVar = (zx) this.f36328b;
                zxVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = zxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((k91) this.f36328b).f38778y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
