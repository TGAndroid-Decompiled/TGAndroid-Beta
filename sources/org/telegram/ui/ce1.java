package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ce1 extends AnimatorListenerAdapter {
    public final int f33121a;
    public final ge1 f33122b;

    public ce1(ge1 ge1Var, int i10) {
        this.f33121a = i10;
        this.f33122b = ge1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33121a) {
            case 0:
                ge1 ge1Var = this.f33122b;
                ge1Var.v = 0;
                ge1Var.f34431n.setVisibility(8);
                return;
            case 1:
                this.f33122b.v = 0;
                return;
            default:
                this.f33122b.C.setVisibility(8);
                return;
        }
    }
}
