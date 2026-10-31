package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k40 extends AnimatorListenerAdapter {
    public final int f27633a;
    public final e50 f27634b;

    public k40(e50 e50Var, int i10) {
        this.f27633a = i10;
        this.f27634b = e50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27633a) {
            case 0:
                e50 e50Var = this.f27634b;
                if (animator.equals(e50Var.K)) {
                    e50Var.K = null;
                    return;
                }
                return;
            case 1:
                e50 e50Var2 = this.f27634b;
                if (e50Var2.f25668k1 != null) {
                    e50Var2.f25668k1 = null;
                    return;
                }
                return;
            default:
                e50 e50Var3 = this.f27634b;
                if (animator.equals(e50Var3.f25652d0)) {
                    e50Var3.c(true);
                    e50Var3.f25658f1 = false;
                    e50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
