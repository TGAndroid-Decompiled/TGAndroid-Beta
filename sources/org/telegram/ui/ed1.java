package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed1 extends AnimatorListenerAdapter {
    public final int f36502a;
    public final id1 f36503b;

    public ed1(id1 id1Var, int i10) {
        this.f36502a = i10;
        this.f36503b = id1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36502a) {
            case 0:
                id1 id1Var = this.f36503b;
                id1Var.v = 0;
                id1Var.f37856n.setVisibility(8);
                return;
            case 1:
                this.f36503b.v = 0;
                return;
            default:
                this.f36503b.F.setVisibility(8);
                return;
        }
    }
}
