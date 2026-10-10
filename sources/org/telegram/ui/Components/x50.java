package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x50 extends AnimatorListenerAdapter {
    public final int f32841a;
    public final u60 f32842b;

    public x50(u60 u60Var, int i10) {
        this.f32841a = i10;
        this.f32842b = u60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32841a) {
            case 0:
                u60 u60Var = this.f32842b;
                if (animator.equals(u60Var.L)) {
                    u60Var.L = null;
                    return;
                }
                return;
            case 1:
                u60 u60Var2 = this.f32842b;
                if (u60Var2.l1 != null) {
                    u60Var2.l1 = null;
                    return;
                }
                return;
            default:
                u60 u60Var3 = this.f32842b;
                if (animator.equals(u60Var3.f31344e0)) {
                    u60Var3.c(true);
                    u60Var3.f31350g1 = false;
                    u60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
