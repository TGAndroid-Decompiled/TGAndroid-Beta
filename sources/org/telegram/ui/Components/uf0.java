package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f30907a;
    public final vf0 f30908b;

    public uf0(vf0 vf0Var, int i10) {
        this.f30907a = i10;
        this.f30908b = vf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30907a) {
            case 0:
                vf0 vf0Var = this.f30908b;
                vf0Var.h = false;
                vf0Var.f31239a = vf0Var.f31241c;
                vf0Var.invalidate();
                int i10 = vf0Var.J;
                if (i10 >= 0) {
                    vf0Var.b(i10);
                    vf0Var.J = -1;
                    return;
                }
                return;
            default:
                vf0 vf0Var2 = this.f30908b;
                vf0Var2.f31244n = false;
                vf0Var2.h = false;
                vf0Var2.invalidate();
                int i11 = vf0Var2.J;
                if (i11 >= 0) {
                    vf0Var2.b(i11);
                    vf0Var2.J = -1;
                }
                vf0Var2.a();
                return;
        }
    }
}
