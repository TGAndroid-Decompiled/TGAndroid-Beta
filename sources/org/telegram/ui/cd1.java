package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final int f35948a;
    public final gd1 f35949b;

    public cd1(gd1 gd1Var, int i10) {
        this.f35948a = i10;
        this.f35949b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35948a) {
            case 0:
                gd1 gd1Var = this.f35949b;
                gd1Var.v = 0;
                gd1Var.f37293n.setVisibility(8);
                return;
            case 1:
                this.f35949b.v = 0;
                return;
            default:
                this.f35949b.F.setVisibility(8);
                return;
        }
    }
}
