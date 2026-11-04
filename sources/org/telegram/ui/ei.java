package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ei implements ValueAnimator.AnimatorUpdateListener {
    public final int f44987a;
    public final org.telegram.ui.ActionBar.d2 f44988b;

    public ei(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f44987a = i3;
        this.f44988b = d2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44987a) {
            case 0:
                wm wmVar = (wm) this.f44988b;
                wmVar.Fa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.m1.invalidate();
                return;
            case 1:
                uw uwVar = (uw) this.f44988b;
                uwVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uwVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((l71) this.f44988b).f47210z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
