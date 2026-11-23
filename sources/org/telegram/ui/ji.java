package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final int f49006a;
    public final org.telegram.ui.ActionBar.g2 f49007b;

    public ji(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f49006a = i7;
        this.f49007b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49006a) {
            case 0:
                bn bnVar = (bn) this.f49007b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.f46064m1.invalidate();
                return;
            case 1:
                cx cxVar = (cx) this.f49007b;
                cxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((x71) this.f49007b).f53706z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
