package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o5 extends AnimatorListenerAdapter {
    public final int f27463a;
    public final u5 f27464b;

    public o5(u5 u5Var, int i10) {
        this.f27463a = i10;
        this.f27464b = u5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27463a) {
            case 0:
                u5.access$002(this.f27464b, null);
                u5.access$102(false);
                return;
            case 1:
                u5 u5Var = this.f27464b;
                u5.access$002(u5Var, null);
                if (u5.access$200(u5Var) != null) {
                    u5.access$200(u5Var).run();
                    u5.access$202(u5Var, null);
                    return;
                }
                return;
            default:
                u5.access$302(this.f27464b, null);
                return;
        }
    }
}
