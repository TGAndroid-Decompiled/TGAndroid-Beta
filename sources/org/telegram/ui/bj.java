package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class bj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32393a;
    public final org.telegram.ui.ActionBar.n2 f32394b;

    public bj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f32393a = i10;
        this.f32394b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32393a) {
            case 0:
                zn znVar = (zn) this.f32394b;
                znVar.f40346la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.X0.invalidate();
                return;
            case 1:
                uy uyVar = (uy) this.f32394b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((vd1) this.f32394b).f38529x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
