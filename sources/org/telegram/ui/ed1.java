package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed1 extends AnimatorListenerAdapter {
    public final int f36469a;
    public final id1 f36470b;

    public ed1(id1 id1Var, int i10) {
        this.f36469a = i10;
        this.f36470b = id1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36469a) {
            case 0:
                id1 id1Var = this.f36470b;
                id1Var.v = 0;
                id1Var.f37832n.setVisibility(8);
                return;
            case 1:
                this.f36470b.v = 0;
                return;
            default:
                this.f36470b.F.setVisibility(8);
                return;
        }
    }
}
