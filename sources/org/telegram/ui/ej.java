package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ej implements ValueAnimator.AnimatorUpdateListener {
    public final int f32222a;
    public final org.telegram.ui.ActionBar.p2 f32223b;

    public ej(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f32222a = i10;
        this.f32223b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32222a) {
            case 0:
                eo eoVar = (eo) this.f32223b;
                eoVar.f32400la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.X0.invalidate();
                return;
            case 1:
                wy wyVar = (wy) this.f32223b;
                wyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((ae1) this.f32223b).f30976x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
