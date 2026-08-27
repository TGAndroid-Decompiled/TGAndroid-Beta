package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class fd1 extends AnimatorListenerAdapter {

    public final int f38076a;

    public final gd1 f38077b;

    public fd1(gd1 gd1Var, int i10) {
        this.f38076a = i10;
        this.f38077b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38076a) {
            case 0:
                this.f38077b.h.f40062s.setVisibility(8);
                break;
            default:
                this.f38077b.h.f40055a.setVisibility(8);
                break;
        }
    }
}
