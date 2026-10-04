package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je1 extends AnimatorListenerAdapter {
    public final int f37668a;
    public final ne1 f37669b;

    public je1(ne1 ne1Var, int i10) {
        this.f37668a = i10;
        this.f37669b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37668a) {
            case 0:
                ne1 ne1Var = this.f37669b;
                ne1Var.v = 0;
                ne1Var.f38961n.setVisibility(8);
                return;
            case 1:
                this.f37669b.v = 0;
                return;
            default:
                this.f37669b.F.setVisibility(8);
                return;
        }
    }
}
