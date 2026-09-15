package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r5 extends AnimatorListenerAdapter {
    public final int f27554a;
    public final x5 f27555b;

    public r5(x5 x5Var, int i10) {
        this.f27554a = i10;
        this.f27555b = x5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27554a) {
            case 0:
                x5.access$002(this.f27555b, null);
                x5.access$102(false);
                return;
            case 1:
                x5 x5Var = this.f27555b;
                x5.access$002(x5Var, null);
                if (x5.access$200(x5Var) != null) {
                    x5.access$200(x5Var).run();
                    x5.access$202(x5Var, null);
                    return;
                }
                return;
            default:
                x5.access$302(this.f27555b, null);
                return;
        }
    }
}
