package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s5 extends AnimatorListenerAdapter {
    public final int f26952a;
    public final y5 f26953b;

    public s5(y5 y5Var, int i10) {
        this.f26952a = i10;
        this.f26953b = y5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26952a) {
            case 0:
                y5.access$002(this.f26953b, null);
                y5.access$102(false);
                return;
            case 1:
                y5 y5Var = this.f26953b;
                y5.access$002(y5Var, null);
                if (y5.access$200(y5Var) != null) {
                    y5.access$200(y5Var).run();
                    y5.access$202(y5Var, null);
                    return;
                }
                return;
            default:
                y5.access$302(this.f26953b, null);
                return;
        }
    }
}
