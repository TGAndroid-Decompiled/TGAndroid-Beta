package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f31569a;
    public final q2 f31570b;

    public o2(q2 q2Var, int i10) {
        this.f31569a = i10;
        this.f31570b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31569a) {
            case 0:
                q2 q2Var = this.f31570b;
                q2Var.f31595r = 0;
                q2Var.invalidate();
                return;
            default:
                q2 q2Var2 = this.f31570b;
                q2Var2.f31596s = 0;
                q2Var2.invalidate();
                return;
        }
    }
}
