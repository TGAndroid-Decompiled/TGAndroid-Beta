package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final int f35947a;
    public final gd1 f35948b;

    public cd1(gd1 gd1Var, int i10) {
        this.f35947a = i10;
        this.f35948b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35947a) {
            case 0:
                gd1 gd1Var = this.f35948b;
                gd1Var.v = 0;
                gd1Var.f37292n.setVisibility(8);
                return;
            case 1:
                this.f35948b.v = 0;
                return;
            default:
                this.f35948b.F.setVisibility(8);
                return;
        }
    }
}
