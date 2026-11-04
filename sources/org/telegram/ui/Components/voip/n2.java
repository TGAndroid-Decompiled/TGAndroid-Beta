package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f39495a;
    public final p2 f39496b;

    public n2(p2 p2Var, int i3) {
        this.f39495a = i3;
        this.f39496b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39495a) {
            case 0:
                p2 p2Var = this.f39496b;
                p2Var.f39522r = 0;
                p2Var.invalidate();
                return;
            default:
                p2 p2Var2 = this.f39496b;
                p2Var2.f39523s = 0;
                p2Var2.invalidate();
                return;
        }
    }
}
