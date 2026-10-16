package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    public final int f36583a;
    public final org.telegram.ui.ActionBar.m2 f36584b;

    public hj(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f36583a = i10;
        this.f36584b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36583a) {
            case 0:
                fo foVar = (fo) this.f36584b;
                foVar.f35718la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.X0.invalidate();
                return;
            case 1:
                yy yyVar = (yy) this.f36584b;
                yyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((ce1) this.f36584b).f34639x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
