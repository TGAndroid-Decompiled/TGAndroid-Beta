package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o50 extends AnimatorListenerAdapter {
    public final int f29096a;
    public final n60 f29097b;

    public o50(n60 n60Var, int i10) {
        this.f29096a = i10;
        this.f29097b = n60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29096a) {
            case 0:
                n60 n60Var = this.f29097b;
                if (animator.equals(n60Var.L)) {
                    n60Var.L = null;
                    return;
                }
                return;
            case 1:
                n60 n60Var2 = this.f29097b;
                if (n60Var2.l1 != null) {
                    n60Var2.l1 = null;
                    return;
                }
                return;
            default:
                n60 n60Var3 = this.f29097b;
                if (animator.equals(n60Var3.f28852e0)) {
                    n60Var3.c(true);
                    n60Var3.f28858g1 = false;
                    n60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
