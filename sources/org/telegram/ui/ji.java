package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final int f48998a;
    public final org.telegram.ui.ActionBar.g2 f48999b;

    public ji(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f48998a = i7;
        this.f48999b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48998a) {
            case 0:
                bn bnVar = (bn) this.f48999b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.f46107m1.invalidate();
                return;
            case 1:
                cx cxVar = (cx) this.f48999b;
                cxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((x71) this.f48999b).f53780z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
