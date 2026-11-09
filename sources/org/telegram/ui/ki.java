package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ki implements ValueAnimator.AnimatorUpdateListener {
    public final int f47298a;
    public final org.telegram.ui.ActionBar.f2 f47299b;

    public ki(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f47298a = i7;
        this.f47299b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47298a) {
            case 0:
                cn cnVar = (cn) this.f47299b;
                cnVar.Ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.l1.invalidate();
                return;
            case 1:
                yw ywVar = (yw) this.f47299b;
                ywVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ywVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((w71) this.f47299b).f50968y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
