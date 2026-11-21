package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f40916a;
    public final d3 f40917b;

    public b3(d3 d3Var, int i7) {
        this.f40916a = i7;
        this.f40917b = d3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40916a) {
            case 0:
                d3 d3Var = this.f40917b;
                d3Var.f40966r = 0;
                d3Var.invalidate();
                return;
            default:
                d3 d3Var2 = this.f40917b;
                d3Var2.f40967s = 0;
                d3Var2.invalidate();
                return;
        }
    }
}
