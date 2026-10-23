package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class id1 extends AnimatorListenerAdapter {
    public final int f38150a;
    public final md1 f38151b;

    public id1(md1 md1Var, int i10) {
        this.f38150a = i10;
        this.f38151b = md1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38150a) {
            case 0:
                md1 md1Var = this.f38151b;
                md1Var.v = 0;
                md1Var.f39515n.setVisibility(8);
                return;
            case 1:
                this.f38151b.v = 0;
                return;
            default:
                this.f38151b.F.setVisibility(8);
                return;
        }
    }
}
