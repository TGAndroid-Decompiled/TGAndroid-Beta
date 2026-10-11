package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f31818a;
    public final b6 f31819b;

    public v5(b6 b6Var, int i10) {
        this.f31818a = i10;
        this.f31819b = b6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31818a) {
            case 0:
                b6.access$002(this.f31819b, null);
                b6.access$102(false);
                return;
            case 1:
                b6 b6Var = this.f31819b;
                b6.access$002(b6Var, null);
                if (b6.access$200(b6Var) != null) {
                    b6.access$200(b6Var).run();
                    b6.access$202(b6Var, null);
                    return;
                }
                return;
            default:
                b6.access$302(this.f31819b, null);
                return;
        }
    }
}
