package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q50 extends AnimatorListenerAdapter {
    public final int f31799a;
    public final p60 f31800b;

    public q50(p60 p60Var, int i10) {
        this.f31799a = i10;
        this.f31800b = p60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31799a) {
            case 0:
                p60 p60Var = this.f31800b;
                if (animator.equals(p60Var.K)) {
                    p60Var.K = null;
                    return;
                }
                return;
            case 1:
                p60 p60Var2 = this.f31800b;
                if (p60Var2.f31489k1 != null) {
                    p60Var2.f31489k1 = null;
                    return;
                }
                return;
            default:
                p60 p60Var3 = this.f31800b;
                if (animator.equals(p60Var3.f31473d0)) {
                    p60Var3.c(true);
                    p60Var3.f31479f1 = false;
                    p60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
