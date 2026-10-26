package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w5 extends AnimatorListenerAdapter {
    public final int f34365a;
    public final c6 f34366b;

    public w5(c6 c6Var, int i10) {
        this.f34365a = i10;
        this.f34366b = c6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34365a) {
            case 0:
                c6.access$002(this.f34366b, null);
                c6.access$102(false);
                return;
            case 1:
                c6 c6Var = this.f34366b;
                c6.access$002(c6Var, null);
                if (c6.access$200(c6Var) != null) {
                    c6.access$200(c6Var).run();
                    c6.access$202(c6Var, null);
                    return;
                }
                return;
            default:
                c6.access$302(this.f34366b, null);
                return;
        }
    }
}
