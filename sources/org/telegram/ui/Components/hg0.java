package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f24865a;
    public final ig0 f24866b;

    public hg0(ig0 ig0Var, int i10) {
        this.f24865a = i10;
        this.f24866b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24865a) {
            case 0:
                ig0 ig0Var = this.f24866b;
                ig0Var.h = false;
                ig0Var.f25112a = ig0Var.f25114c;
                ig0Var.invalidate();
                int i10 = ig0Var.J;
                if (i10 >= 0) {
                    ig0Var.b(i10);
                    ig0Var.J = -1;
                    return;
                }
                return;
            default:
                ig0 ig0Var2 = this.f24866b;
                ig0Var2.f25116n = false;
                ig0Var2.h = false;
                ig0Var2.invalidate();
                int i11 = ig0Var2.J;
                if (i11 >= 0) {
                    ig0Var2.b(i11);
                    ig0Var2.J = -1;
                }
                ig0Var2.a();
                return;
        }
    }
}
