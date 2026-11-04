package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f39991a;
    public final xd0 f39992b;

    public wd0(xd0 xd0Var, int i3) {
        this.f39991a = i3;
        this.f39992b = xd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39991a) {
            case 0:
                xd0 xd0Var = this.f39992b;
                xd0Var.h = false;
                xd0Var.f40312a = xd0Var.f40314c;
                xd0Var.invalidate();
                int i3 = xd0Var.K;
                if (i3 >= 0) {
                    xd0Var.b(i3);
                    xd0Var.K = -1;
                    return;
                }
                return;
            default:
                xd0 xd0Var2 = this.f39992b;
                xd0Var2.f40317n = false;
                xd0Var2.h = false;
                xd0Var2.invalidate();
                int i10 = xd0Var2.K;
                if (i10 >= 0) {
                    xd0Var2.b(i10);
                    xd0Var2.K = -1;
                }
                xd0Var2.a();
                return;
        }
    }
}
