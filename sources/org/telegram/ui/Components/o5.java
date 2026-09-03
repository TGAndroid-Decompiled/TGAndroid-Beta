package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o5 extends AnimatorListenerAdapter {
    public final int f29664a;
    public final u5 f29665b;

    public o5(u5 u5Var, int i10) {
        this.f29664a = i10;
        this.f29665b = u5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29664a) {
            case 0:
                u5.access$002(this.f29665b, null);
                u5.access$102(false);
                return;
            case 1:
                u5 u5Var = this.f29665b;
                u5.access$002(u5Var, null);
                if (u5.access$200(u5Var) != null) {
                    u5.access$200(u5Var).run();
                    u5.access$202(u5Var, null);
                    return;
                }
                return;
            default:
                u5.access$302(this.f29665b, null);
                return;
        }
    }
}
