package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ae1 extends AnimatorListenerAdapter {
    public final int f35152a;
    public final be1 f35153b;

    public ae1(be1 be1Var, int i10) {
        this.f35152a = i10;
        this.f35153b = be1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35152a) {
            case 0:
                this.f35153b.h.f37361s.setVisibility(8);
                return;
            default:
                this.f35153b.h.f37354a.setVisibility(8);
                return;
        }
    }
}
