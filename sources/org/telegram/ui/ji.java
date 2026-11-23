package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final int f49002a;
    public final org.telegram.ui.ActionBar.g2 f49003b;

    public ji(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f49002a = i7;
        this.f49003b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49002a) {
            case 0:
                bn bnVar = (bn) this.f49003b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.f46111m1.invalidate();
                return;
            case 1:
                cx cxVar = (cx) this.f49003b;
                cxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((x71) this.f49003b).f53784z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
