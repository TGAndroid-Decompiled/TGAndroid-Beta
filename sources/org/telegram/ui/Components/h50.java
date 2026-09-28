package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h50 extends AnimatorListenerAdapter {
    public final int f24700a;
    public final e60 f24701b;

    public h50(e60 e60Var, int i10) {
        this.f24700a = i10;
        this.f24701b = e60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24700a) {
            case 0:
                e60 e60Var = this.f24701b;
                if (animator.equals(e60Var.L)) {
                    e60Var.L = null;
                    return;
                }
                return;
            case 1:
                e60 e60Var2 = this.f24701b;
                if (e60Var2.f23896g1 != null) {
                    e60Var2.f23896g1 = null;
                    return;
                }
                return;
            default:
                e60 e60Var3 = this.f24701b;
                if (animator.equals(e60Var3.f23890e0)) {
                    e60Var3.c(true);
                    e60Var3.f23885b1 = false;
                    e60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
