package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class bj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32374a;
    public final org.telegram.ui.ActionBar.o2 f32375b;

    public bj(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f32374a = i10;
        this.f32375b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32374a) {
            case 0:
                xn xnVar = (xn) this.f32375b;
                xnVar.f39835la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.X0.invalidate();
                return;
            case 1:
                ty tyVar = (ty) this.f32375b;
                tyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((pd1) this.f32375b).f36452x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
