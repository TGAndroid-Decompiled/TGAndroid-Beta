package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25233a;
    public final e40 f25234b;

    public c40(e40 e40Var, int i10) {
        this.f25233a = i10;
        this.f25234b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25233a) {
            case 0:
                e40 e40Var = this.f25234b;
                if (e40Var.f25818b0 == animator) {
                    e40Var.f25818b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25234b;
                if (e40Var2.f25816a0 == animator) {
                    e40Var2.f25816a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25233a) {
            case 1:
                d40 d40Var = this.f25234b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.es0) d40Var).f37021a.f33580e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
