package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u5 extends AnimatorListenerAdapter {
    public final int f30851a;
    public final a6 f30852b;

    public u5(a6 a6Var, int i10) {
        this.f30851a = i10;
        this.f30852b = a6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30851a) {
            case 0:
                a6.access$002(this.f30852b, null);
                a6.access$102(false);
                return;
            case 1:
                a6 a6Var = this.f30852b;
                a6.access$002(a6Var, null);
                if (a6.access$200(a6Var) != null) {
                    a6.access$200(a6Var).run();
                    a6.access$202(a6Var, null);
                    return;
                }
                return;
            default:
                a6.access$302(this.f30852b, null);
                return;
        }
    }
}
