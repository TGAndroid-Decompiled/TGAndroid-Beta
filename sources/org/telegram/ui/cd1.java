package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final int f35944a;
    public final gd1 f35945b;

    public cd1(gd1 gd1Var, int i10) {
        this.f35944a = i10;
        this.f35945b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35944a) {
            case 0:
                gd1 gd1Var = this.f35945b;
                gd1Var.v = 0;
                gd1Var.f37288n.setVisibility(8);
                return;
            case 1:
                this.f35945b.v = 0;
                return;
            default:
                this.f35945b.F.setVisibility(8);
                return;
        }
    }
}
