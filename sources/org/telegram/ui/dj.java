package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class dj implements ValueAnimator.AnimatorUpdateListener {
    public final int f36986a;
    public final org.telegram.ui.ActionBar.n2 f36987b;

    public dj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f36986a = i10;
        this.f36987b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36986a) {
            case 0:
                zn znVar = (zn) this.f36987b;
                znVar.f44845la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                ty tyVar = (ty) this.f36987b;
                tyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((xd1) this.f36987b).f43998x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
