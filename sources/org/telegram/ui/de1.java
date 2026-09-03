package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class de1 extends AnimatorListenerAdapter {
    public final int f36175a;
    public final he1 f36176b;

    public de1(he1 he1Var, int i10) {
        this.f36175a = i10;
        this.f36176b = he1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36175a) {
            case 0:
                he1 he1Var = this.f36176b;
                he1Var.v = 0;
                he1Var.f37359n.setVisibility(8);
                return;
            case 1:
                this.f36176b.v = 0;
                return;
            default:
                this.f36176b.C.setVisibility(8);
                return;
        }
    }
}
