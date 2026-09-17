package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f36084a;
    public final oe1 f36085b;

    public ne1(oe1 oe1Var, int i10) {
        this.f36084a = i10;
        this.f36085b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36084a) {
            case 0:
                this.f36085b.h.f38058s.setVisibility(8);
                return;
            default:
                this.f36085b.h.f38052a.setVisibility(8);
                return;
        }
    }
}
