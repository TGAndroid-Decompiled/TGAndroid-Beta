package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f37074a;
    public final le1 f37075b;

    public he1(le1 le1Var, int i10) {
        this.f37074a = i10;
        this.f37075b = le1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37074a) {
            case 0:
                le1 le1Var = this.f37075b;
                le1Var.v = 0;
                le1Var.f38302n.setVisibility(8);
                return;
            case 1:
                this.f37075b.v = 0;
                return;
            default:
                this.f37075b.F.setVisibility(8);
                return;
        }
    }
}
