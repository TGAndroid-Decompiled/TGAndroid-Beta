package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32795a;
    public final org.telegram.ui.ActionBar.n2 f32796b;

    public cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f32795a = i10;
        this.f32796b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32795a) {
            case 0:
                zn znVar = (zn) this.f32796b;
                znVar.f40409la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f32796b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((xd1) this.f32796b).f39556x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
