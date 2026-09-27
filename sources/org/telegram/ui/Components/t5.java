package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t5 extends AnimatorListenerAdapter {
    public final int f28480a;
    public final z5 f28481b;

    public t5(z5 z5Var, int i10) {
        this.f28480a = i10;
        this.f28481b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28480a) {
            case 0:
                z5.access$002(this.f28481b, null);
                z5.access$102(false);
                return;
            case 1:
                z5 z5Var = this.f28481b;
                z5.access$002(z5Var, null);
                if (z5.access$200(z5Var) != null) {
                    z5.access$200(z5Var).run();
                    z5.access$202(z5Var, null);
                    return;
                }
                return;
            default:
                z5.access$302(this.f28481b, null);
                return;
        }
    }
}
