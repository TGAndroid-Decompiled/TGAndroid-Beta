package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i01 extends AnimatorListenerAdapter {
    public final int f34412a;
    public final r01 f34413b;

    public i01(r01 r01Var, int i7) {
        this.f34412a = i7;
        this.f34413b = r01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34412a) {
            case 0:
                r01 r01Var = this.f34413b;
                if (r01Var.U == animator) {
                    r01Var.U = null;
                    return;
                }
                return;
            case 1:
                r01 r01Var2 = this.f34413b;
                if (r01Var2.f37464g0 == animator) {
                    r01Var2.f37464g0 = null;
                }
                r01Var2.b(1.0f);
                return;
            default:
                r01 r01Var3 = this.f34413b;
                if (r01Var3.J == animator) {
                    r01Var3.J = null;
                    return;
                }
                return;
        }
    }
}
