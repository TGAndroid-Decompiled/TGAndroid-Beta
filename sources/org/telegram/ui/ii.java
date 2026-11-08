package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ii implements ValueAnimator.AnimatorUpdateListener {
    public final int f46677a;
    public final org.telegram.ui.ActionBar.f2 f46678b;

    public ii(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f46677a = i7;
        this.f46678b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46677a) {
            case 0:
                an anVar = (an) this.f46678b;
                anVar.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.l1.invalidate();
                return;
            case 1:
                ww wwVar = (ww) this.f46678b;
                wwVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wwVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((v71) this.f46678b).f50586y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
