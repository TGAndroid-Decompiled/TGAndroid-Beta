package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32802a;
    public final org.telegram.ui.ActionBar.n2 f32803b;

    public cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f32802a = i10;
        this.f32803b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32802a) {
            case 0:
                bo boVar = (bo) this.f32803b;
                boVar.f32382la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f32803b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((vd1) this.f32803b).f38575x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
