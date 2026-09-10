package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o50 extends AnimatorListenerAdapter {
    public final int f25675a;
    public final f60 f25676b;

    public o50(f60 f60Var, int i10) {
        this.f25675a = i10;
        this.f25676b = f60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25675a) {
            case 0:
                f60 f60Var = this.f25676b;
                if (animator.equals(f60Var.G)) {
                    f60Var.G = null;
                    return;
                }
                return;
            case 1:
                f60 f60Var2 = this.f25676b;
                if (f60Var2.f22878b1 != null) {
                    f60Var2.f22878b1 = null;
                    return;
                }
                return;
            default:
                f60 f60Var3 = this.f25676b;
                if (animator.equals(f60Var3.W)) {
                    f60Var3.h(true);
                    f60Var3.W0 = false;
                    f60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
