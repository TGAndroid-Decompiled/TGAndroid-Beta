package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    public final int f36832a;
    public final org.telegram.ui.ActionBar.m2 f36833b;

    public hj(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f36832a = i10;
        this.f36833b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36832a) {
            case 0:
                fo foVar = (fo) this.f36833b;
                foVar.f36017la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.X0.invalidate();
                return;
            case 1:
                yy yyVar = (yy) this.f36833b;
                yyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((ce1) this.f36833b).f34915x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
