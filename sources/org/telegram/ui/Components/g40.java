package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g40 extends AnimatorListenerAdapter {
    public final int f24873a;
    public final i40 f24874b;

    public g40(i40 i40Var, int i10) {
        this.f24873a = i10;
        this.f24874b = i40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24873a) {
            case 0:
                i40 i40Var = this.f24874b;
                if (i40Var.f25485b0 == animator) {
                    i40Var.f25485b0 = null;
                    i40Var.b();
                    return;
                }
                return;
            default:
                i40 i40Var2 = this.f24874b;
                if (i40Var2.f25483a0 == animator) {
                    i40Var2.f25483a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24873a) {
            case 1:
                h40 h40Var = this.f24874b.W;
                if (h40Var != null) {
                    ((org.telegram.ui.bt0) h40Var).f34385a.f31928e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
