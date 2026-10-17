package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25083a;
    public final e40 f25084b;

    public c40(e40 e40Var, int i10) {
        this.f25083a = i10;
        this.f25084b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25083a) {
            case 0:
                e40 e40Var = this.f25084b;
                if (e40Var.f25795b0 == animator) {
                    e40Var.f25795b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25084b;
                if (e40Var2.f25793a0 == animator) {
                    e40Var2.f25793a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25083a) {
            case 1:
                d40 d40Var = this.f25084b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.ds0) d40Var).f36318a.f33266e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
