package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f31889a;
    public final q2 f31890b;

    public p2(q2 q2Var, int i10) {
        this.f31889a = i10;
        this.f31890b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31889a) {
            case 0:
                this.f31890b.f31922b.setVisibility(8);
                return;
            default:
                this.f31890b.f31923c.setVisibility(8);
                return;
        }
    }
}
