package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f27224a;
    public final ig0 f27225b;

    public hg0(ig0 ig0Var, int i10) {
        this.f27224a = i10;
        this.f27225b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27224a) {
            case 0:
                ig0 ig0Var = this.f27225b;
                ig0Var.h = false;
                ig0Var.f27502a = ig0Var.f27504c;
                ig0Var.invalidate();
                int i10 = ig0Var.J;
                if (i10 >= 0) {
                    ig0Var.b(i10);
                    ig0Var.J = -1;
                    return;
                }
                return;
            default:
                ig0 ig0Var2 = this.f27225b;
                ig0Var2.f27507n = false;
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
