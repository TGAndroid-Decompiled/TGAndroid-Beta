package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe1 extends AnimatorListenerAdapter {
    public final int f36039a;
    public final re1 f36040b;

    public qe1(re1 re1Var, int i10) {
        this.f36039a = i10;
        this.f36040b = re1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36039a) {
            case 0:
                this.f36040b.h.f38700s.setVisibility(8);
                return;
            default:
                this.f36040b.h.f38694a.setVisibility(8);
                return;
        }
    }
}
