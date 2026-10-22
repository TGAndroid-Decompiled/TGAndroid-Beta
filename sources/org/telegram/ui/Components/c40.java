package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25100a;
    public final e40 f25101b;

    public c40(e40 e40Var, int i10) {
        this.f25100a = i10;
        this.f25101b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25100a) {
            case 0:
                e40 e40Var = this.f25101b;
                if (e40Var.f25713b0 == animator) {
                    e40Var.f25713b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25101b;
                if (e40Var2.f25711a0 == animator) {
                    e40Var2.f25711a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25100a) {
            case 1:
                d40 d40Var = this.f25101b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.bs0) d40Var).f35743a.f33282e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
