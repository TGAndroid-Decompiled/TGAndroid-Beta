package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29551a;
    public final q2 f29552b;

    public p2(q2 q2Var, int i10) {
        this.f29551a = i10;
        this.f29552b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29551a) {
            case 0:
                this.f29552b.f29574b.setVisibility(8);
                return;
            default:
                this.f29552b.f29575c.setVisibility(8);
                return;
        }
    }
}
