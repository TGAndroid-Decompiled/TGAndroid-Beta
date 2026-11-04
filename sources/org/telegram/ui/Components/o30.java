package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o30 extends AnimatorListenerAdapter {
    public final int f36685a;
    public final k40 f36686b;

    public o30(k40 k40Var, int i3) {
        this.f36685a = i3;
        this.f36686b = k40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36685a) {
            case 0:
                k40 k40Var = this.f36686b;
                if (animator.equals(k40Var.L)) {
                    k40Var.L = null;
                    return;
                }
                return;
            case 1:
                k40 k40Var2 = this.f36686b;
                if (k40Var2.f35288l1 != null) {
                    k40Var2.f35288l1 = null;
                    return;
                }
                return;
            default:
                k40 k40Var3 = this.f36686b;
                if (animator.equals(k40Var3.f35273e0)) {
                    k40Var3.c(true);
                    k40Var3.f35279g1 = false;
                    k40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
