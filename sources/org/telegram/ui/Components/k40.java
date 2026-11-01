package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k40 extends AnimatorListenerAdapter {
    public final int f27724a;
    public final e50 f27725b;

    public k40(e50 e50Var, int i10) {
        this.f27724a = i10;
        this.f27725b = e50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27724a) {
            case 0:
                e50 e50Var = this.f27725b;
                if (animator.equals(e50Var.K)) {
                    e50Var.K = null;
                    return;
                }
                return;
            case 1:
                e50 e50Var2 = this.f27725b;
                if (e50Var2.f25717k1 != null) {
                    e50Var2.f25717k1 = null;
                    return;
                }
                return;
            default:
                e50 e50Var3 = this.f27725b;
                if (animator.equals(e50Var3.f25701d0)) {
                    e50Var3.c(true);
                    e50Var3.f25707f1 = false;
                    e50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
