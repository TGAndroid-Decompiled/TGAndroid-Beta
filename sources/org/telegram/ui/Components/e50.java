package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e50 extends AnimatorListenerAdapter {
    public final int f23739a;
    public final a60 f23740b;

    public e50(a60 a60Var, int i10) {
        this.f23739a = i10;
        this.f23740b = a60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23739a) {
            case 0:
                a60 a60Var = this.f23740b;
                if (animator.equals(a60Var.J)) {
                    a60Var.J = null;
                    return;
                }
                return;
            case 1:
                a60 a60Var2 = this.f23740b;
                if (a60Var2.f22542e1 != null) {
                    a60Var2.f22542e1 = null;
                    return;
                }
                return;
            default:
                a60 a60Var3 = this.f23740b;
                if (animator.equals(a60Var3.f22537c0)) {
                    a60Var3.c(true);
                    a60Var3.Z0 = false;
                    a60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
