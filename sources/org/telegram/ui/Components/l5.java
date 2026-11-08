package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l5 extends AnimatorListenerAdapter {
    public final int f35533a;
    public final r5 f35534b;

    public l5(r5 r5Var, int i7) {
        this.f35533a = i7;
        this.f35534b = r5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35533a) {
            case 0:
                r5.access$002(this.f35534b, null);
                r5.access$102(false);
                return;
            case 1:
                r5 r5Var = this.f35534b;
                r5.access$002(r5Var, null);
                if (r5.access$200(r5Var) != null) {
                    r5.access$200(r5Var).run();
                    r5.access$202(r5Var, null);
                    return;
                }
                return;
            default:
                r5.access$302(this.f35534b, null);
                return;
        }
    }
}
