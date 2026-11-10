package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k5 extends AnimatorListenerAdapter {
    public final int f35166a;
    public final q5 f35167b;

    public k5(q5 q5Var, int i7) {
        this.f35166a = i7;
        this.f35167b = q5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35166a) {
            case 0:
                q5.access$002(this.f35167b, null);
                q5.access$102(false);
                return;
            case 1:
                q5 q5Var = this.f35167b;
                q5.access$002(q5Var, null);
                if (q5.access$200(q5Var) != null) {
                    q5.access$200(q5Var).run();
                    q5.access$202(q5Var, null);
                    return;
                }
                return;
            default:
                q5.access$302(this.f35167b, null);
                return;
        }
    }
}
