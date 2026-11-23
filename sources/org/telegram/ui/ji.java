package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final int f49128a;
    public final org.telegram.ui.ActionBar.g2 f49129b;

    public ji(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f49128a = i7;
        this.f49129b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49128a) {
            case 0:
                bn bnVar = (bn) this.f49129b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.f46279m1.invalidate();
                return;
            case 1:
                bx bxVar = (bx) this.f49129b;
                bxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((v71) this.f49129b).f52914z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
