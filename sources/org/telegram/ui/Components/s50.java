package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s50 extends AnimatorListenerAdapter {
    public final int f28745a;
    public final p60 f28746b;

    public s50(p60 p60Var, int i10) {
        this.f28745a = i10;
        this.f28746b = p60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28745a) {
            case 0:
                p60 p60Var = this.f28746b;
                if (animator.equals(p60Var.L)) {
                    p60Var.L = null;
                    return;
                }
                return;
            case 1:
                p60 p60Var2 = this.f28746b;
                if (p60Var2.l1 != null) {
                    p60Var2.l1 = null;
                    return;
                }
                return;
            default:
                p60 p60Var3 = this.f28746b;
                if (animator.equals(p60Var3.f27859e0)) {
                    p60Var3.c(true);
                    p60Var3.f27865g1 = false;
                    p60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
