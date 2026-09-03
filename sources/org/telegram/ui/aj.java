package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class aj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32598a;
    public final org.telegram.ui.ActionBar.p2 f32599b;

    public aj(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f32598a = i10;
        this.f32599b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32598a) {
            case 0:
                zn znVar = (zn) this.f32599b;
                znVar.f40623ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.U0.invalidate();
                return;
            case 1:
                qy qyVar = (qy) this.f32599b;
                qyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((jd1) this.f32599b).f35230u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
