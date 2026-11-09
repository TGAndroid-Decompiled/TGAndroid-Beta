package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f38261a;
    public final p40 f38262b;

    public t30(p40 p40Var, int i7) {
        this.f38261a = i7;
        this.f38262b = p40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38261a) {
            case 0:
                p40 p40Var = this.f38262b;
                if (animator.equals(p40Var.K)) {
                    p40Var.K = null;
                    return;
                }
                return;
            case 1:
                p40 p40Var2 = this.f38262b;
                if (p40Var2.f36906k1 != null) {
                    p40Var2.f36906k1 = null;
                    return;
                }
                return;
            default:
                p40 p40Var3 = this.f38262b;
                if (animator.equals(p40Var3.f36889d0)) {
                    p40Var3.d(true);
                    p40Var3.f36896f1 = false;
                    p40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
