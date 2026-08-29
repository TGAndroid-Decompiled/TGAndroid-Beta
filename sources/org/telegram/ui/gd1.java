package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gd1 extends AnimatorListenerAdapter {
    public final int f38565a;
    public final hd1 f38566b;

    public gd1(hd1 hd1Var, int i10) {
        this.f38565a = i10;
        this.f38566b = hd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38565a) {
            case 0:
                this.f38566b.h.f40536s.setVisibility(8);
                return;
            default:
                this.f38566b.h.f40529a.setVisibility(8);
                return;
        }
    }
}
