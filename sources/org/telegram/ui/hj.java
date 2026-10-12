package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    public final int f38443a;
    public final org.telegram.ui.ActionBar.m2 f38444b;

    public hj(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f38443a = i10;
        this.f38444b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38443a) {
            case 0:
                eo eoVar = (eo) this.f38444b;
                eoVar.f37335la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.X0.invalidate();
                return;
            case 1:
                vy vyVar = (vy) this.f38444b;
                vyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((zd1) this.f38444b).f44792x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
