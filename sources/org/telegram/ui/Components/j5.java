package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j5 extends AnimatorListenerAdapter {
    public final int f35877a;
    public final p5 f35878b;

    public j5(p5 p5Var, int i7) {
        this.f35877a = i7;
        this.f35878b = p5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35877a) {
            case 0:
                p5.access$002(this.f35878b, null);
                p5.access$102(false);
                return;
            case 1:
                p5 p5Var = this.f35878b;
                p5.access$002(p5Var, null);
                if (p5.access$200(p5Var) != null) {
                    p5.access$200(p5Var).run();
                    p5.access$202(p5Var, null);
                    return;
                }
                return;
            default:
                p5.access$302(this.f35878b, null);
                return;
        }
    }
}
