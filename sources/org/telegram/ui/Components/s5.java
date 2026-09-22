package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s5 extends AnimatorListenerAdapter {
    public final int f28123a;
    public final y5 f28124b;

    public s5(y5 y5Var, int i10) {
        this.f28123a = i10;
        this.f28124b = y5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28123a) {
            case 0:
                y5.access$002(this.f28124b, null);
                y5.access$102(false);
                return;
            case 1:
                y5 y5Var = this.f28124b;
                y5.access$002(y5Var, null);
                if (y5.access$200(y5Var) != null) {
                    y5.access$200(y5Var).run();
                    y5.access$202(y5Var, null);
                    return;
                }
                return;
            default:
                y5.access$302(this.f28124b, null);
                return;
        }
    }
}
