package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29494a;
    public final q2 f29495b;

    public p2(q2 q2Var, int i10) {
        this.f29494a = i10;
        this.f29495b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29494a) {
            case 0:
                this.f29495b.f29517b.setVisibility(8);
                return;
            default:
                this.f29495b.f29518c.setVisibility(8);
                return;
        }
    }
}
