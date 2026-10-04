package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je1 extends AnimatorListenerAdapter {
    public final int f37667a;
    public final ne1 f37668b;

    public je1(ne1 ne1Var, int i10) {
        this.f37667a = i10;
        this.f37668b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37667a) {
            case 0:
                ne1 ne1Var = this.f37668b;
                ne1Var.v = 0;
                ne1Var.f38960n.setVisibility(8);
                return;
            case 1:
                this.f37668b.v = 0;
                return;
            default:
                this.f37668b.F.setVisibility(8);
                return;
        }
    }
}
