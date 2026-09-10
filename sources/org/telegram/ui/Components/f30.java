package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22833a;
    public final j30 f22834b;

    public f30(j30 j30Var, int i10) {
        this.f22833a = i10;
        this.f22834b = j30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22833a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var = this.f22834b;
                j30Var.f24217r.x = (int) floatValue;
                j30Var.h();
                h30 h30Var = j30Var.f24209a;
                if (h30Var.getParent() != null) {
                    j30Var.f24216n.updateViewLayout(h30Var, j30Var.f24217r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var2 = this.f22834b;
                j30Var2.f24217r.y = (int) floatValue2;
                h30 h30Var2 = j30Var2.f24209a;
                if (h30Var2.getParent() != null) {
                    j30Var2.f24216n.updateViewLayout(h30Var2, j30Var2.f24217r);
                    return;
                }
                return;
        }
    }
}
