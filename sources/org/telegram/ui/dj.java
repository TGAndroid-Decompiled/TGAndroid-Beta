package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f33133a;
    public final org.telegram.ui.ActionBar.o2 f33134b;

    public dj(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f33133a = i10;
        this.f33134b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33133a) {
            case 0:
                bo boVar = (bo) this.f33134b;
                boVar.f32360la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.X0.invalidate();
                return;
            case 1:
                wy wyVar = (wy) this.f33134b;
                wyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((xd1) this.f33134b).f39593x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
