package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class id1 extends AnimatorListenerAdapter {
    public final int f39212a;
    public final md1 f39213b;

    public id1(md1 md1Var, int i10) {
        this.f39212a = i10;
        this.f39213b = md1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39212a) {
            case 0:
                md1 md1Var = this.f39213b;
                md1Var.v = 0;
                md1Var.f40534n.setVisibility(8);
                return;
            case 1:
                this.f39213b.v = 0;
                return;
            default:
                this.f39213b.B.setVisibility(8);
                return;
        }
    }
}
