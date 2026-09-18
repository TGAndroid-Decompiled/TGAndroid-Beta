package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le1 extends AnimatorListenerAdapter {
    public final int f35361a;
    public final me1 f35362b;

    public le1(me1 me1Var, int i10) {
        this.f35361a = i10;
        this.f35362b = me1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35361a) {
            case 0:
                this.f35362b.h.f37271s.setVisibility(8);
                return;
            default:
                this.f35362b.h.f37265a.setVisibility(8);
                return;
        }
    }
}
