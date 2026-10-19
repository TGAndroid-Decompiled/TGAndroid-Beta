package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25074a;
    public final e40 f25075b;

    public c40(e40 e40Var, int i10) {
        this.f25074a = i10;
        this.f25075b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25074a) {
            case 0:
                e40 e40Var = this.f25075b;
                if (e40Var.f25766b0 == animator) {
                    e40Var.f25766b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25075b;
                if (e40Var2.f25764a0 == animator) {
                    e40Var2.f25764a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25074a) {
            case 1:
                d40 d40Var = this.f25075b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.bs0) d40Var).f35740a.f33272e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
