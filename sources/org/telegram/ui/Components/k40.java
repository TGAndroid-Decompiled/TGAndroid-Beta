package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k40 extends AnimatorListenerAdapter {
    public final int f27838a;
    public final m40 f27839b;

    public k40(m40 m40Var, int i10) {
        this.f27838a = i10;
        this.f27839b = m40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27838a) {
            case 0:
                m40 m40Var = this.f27839b;
                if (m40Var.f28668b0 == animator) {
                    m40Var.f28668b0 = null;
                    m40Var.b();
                    return;
                }
                return;
            default:
                m40 m40Var2 = this.f27839b;
                if (m40Var2.f28666a0 == animator) {
                    m40Var2.f28666a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27838a) {
            case 1:
                l40 l40Var = this.f27839b.W;
                if (l40Var != null) {
                    ((org.telegram.ui.vs0) l40Var).f42975a.f33904e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
