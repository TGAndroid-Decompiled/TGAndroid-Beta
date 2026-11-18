package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final int f48965a;
    public final org.telegram.ui.ActionBar.h2 f48966b;

    public ji(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f48965a = i7;
        this.f48966b = h2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48965a) {
            case 0:
                bn bnVar = (bn) this.f48966b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.f46084m1.invalidate();
                return;
            case 1:
                cx cxVar = (cx) this.f48966b;
                cxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((x71) this.f48966b).f53739z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
