package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o40 extends AnimatorListenerAdapter {
    public final int f31281a;
    public final f50 f31282b;

    public o40(f50 f50Var, int i9) {
        this.f31281a = i9;
        this.f31282b = f50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31281a) {
            case 0:
                f50 f50Var = this.f31282b;
                if (animator.equals(f50Var.C)) {
                    f50Var.C = null;
                    return;
                }
                return;
            case 1:
                f50 f50Var2 = this.f31282b;
                if (f50Var2.X0 != null) {
                    f50Var2.X0 = null;
                    return;
                }
                return;
            default:
                f50 f50Var3 = this.f31282b;
                if (animator.equals(f50Var3.S)) {
                    f50Var3.h(true);
                    f50Var3.S0 = false;
                    f50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
