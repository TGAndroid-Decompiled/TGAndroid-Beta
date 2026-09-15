package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le1 extends AnimatorListenerAdapter {
    public final int f35483a;
    public final me1 f35484b;

    public le1(me1 me1Var, int i10) {
        this.f35483a = i10;
        this.f35484b = me1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35483a) {
            case 0:
                this.f35484b.h.f37374s.setVisibility(8);
                return;
            default:
                this.f35484b.h.f37368a.setVisibility(8);
                return;
        }
    }
}
