package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed1 extends AnimatorListenerAdapter {
    public final int f36882a;
    public final fd1 f36883b;

    public ed1(fd1 fd1Var, int i10) {
        this.f36882a = i10;
        this.f36883b = fd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36882a) {
            case 0:
                this.f36883b.f37309s.f39208s.setVisibility(8);
                return;
            default:
                this.f36883b.f37309s.f39202a.setVisibility(8);
                return;
        }
    }
}
