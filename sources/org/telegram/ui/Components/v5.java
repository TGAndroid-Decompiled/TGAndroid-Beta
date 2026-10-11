package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f31677a;
    public final b6 f31678b;

    public v5(b6 b6Var, int i10) {
        this.f31677a = i10;
        this.f31678b = b6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31677a) {
            case 0:
                b6.access$002(this.f31678b, null);
                b6.access$102(false);
                return;
            case 1:
                b6 b6Var = this.f31678b;
                b6.access$002(b6Var, null);
                if (b6.access$200(b6Var) != null) {
                    b6.access$200(b6Var).run();
                    b6.access$202(b6Var, null);
                    return;
                }
                return;
            default:
                b6.access$302(this.f31678b, null);
                return;
        }
    }
}
