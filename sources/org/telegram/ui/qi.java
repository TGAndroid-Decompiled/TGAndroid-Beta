package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qi implements ValueAnimator.AnimatorUpdateListener {
    public final int f41809a;
    public final org.telegram.ui.ActionBar.o2 f41810b;

    public qi(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f41809a = i9;
        this.f41810b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41809a) {
            case 0:
                qn qnVar = (qn) this.f41810b;
                qnVar.f41939ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.T0.invalidate();
                return;
            case 1:
                dy dyVar = (dy) this.f41810b;
                dyVar.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = dyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((oc1) this.f41810b).f41105t0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
