package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ii implements ValueAnimator.AnimatorUpdateListener {
    public final int f48048a;
    public final org.telegram.ui.ActionBar.e2 f48049b;

    public ii(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f48048a = i7;
        this.f48049b = e2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48048a) {
            case 0:
                an anVar = (an) this.f48049b;
                anVar.Ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.f45277m1.invalidate();
                return;
            case 1:
                yw ywVar = (yw) this.f48049b;
                ywVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ywVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((t71) this.f48049b).f51478z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
