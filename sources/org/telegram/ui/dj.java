package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f33137a;
    public final org.telegram.ui.ActionBar.o2 f33138b;

    public dj(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f33137a = i10;
        this.f33138b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33137a) {
            case 0:
                bo boVar = (bo) this.f33138b;
                boVar.f32364la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.X0.invalidate();
                return;
            case 1:
                wy wyVar = (wy) this.f33138b;
                wyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((xd1) this.f33138b).f39598x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
