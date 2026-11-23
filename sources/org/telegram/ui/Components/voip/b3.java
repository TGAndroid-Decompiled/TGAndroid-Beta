package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f40918a;
    public final d3 f40919b;

    public b3(d3 d3Var, int i7) {
        this.f40918a = i7;
        this.f40919b = d3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40918a) {
            case 0:
                d3 d3Var = this.f40919b;
                d3Var.f40968r = 0;
                d3Var.invalidate();
                return;
            default:
                d3 d3Var2 = this.f40919b;
                d3Var2.f40969s = 0;
                d3Var2.invalidate();
                return;
        }
    }
}
