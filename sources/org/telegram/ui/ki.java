package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ki implements ValueAnimator.AnimatorUpdateListener {
    public final int f47309a;
    public final org.telegram.ui.ActionBar.f2 f47310b;

    public ki(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f47309a = i7;
        this.f47310b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47309a) {
            case 0:
                cn cnVar = (cn) this.f47310b;
                cnVar.Ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.l1.invalidate();
                return;
            case 1:
                zw zwVar = (zw) this.f47310b;
                zwVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = zwVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((x71) this.f47310b).f51627y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
