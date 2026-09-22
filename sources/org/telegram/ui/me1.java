package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class me1 extends AnimatorListenerAdapter {
    public final int f35730a;
    public final ne1 f35731b;

    public me1(ne1 ne1Var, int i10) {
        this.f35730a = i10;
        this.f35731b = ne1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35730a) {
            case 0:
                this.f35731b.h.f37654s.setVisibility(8);
                return;
            default:
                this.f35731b.h.f37648a.setVisibility(8);
                return;
        }
    }
}
