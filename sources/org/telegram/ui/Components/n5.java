package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n5 extends AnimatorListenerAdapter {
    public final int f31024a;
    public final t5 f31025b;

    public n5(t5 t5Var, int i9) {
        this.f31024a = i9;
        this.f31025b = t5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31024a) {
            case 0:
                t5.access$002(this.f31025b, null);
                t5.access$102(false);
                return;
            case 1:
                t5 t5Var = this.f31025b;
                t5.access$002(t5Var, null);
                if (t5.access$200(t5Var) != null) {
                    t5.access$200(t5Var).run();
                    t5.access$202(t5Var, null);
                    return;
                }
                return;
            default:
                t5.access$302(this.f31025b, null);
                return;
        }
    }
}
