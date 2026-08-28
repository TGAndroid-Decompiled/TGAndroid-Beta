package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed1 extends AnimatorListenerAdapter {
    public final int f37912a;
    public final fd1 f37913b;

    public ed1(fd1 fd1Var, int i9) {
        this.f37912a = i9;
        this.f37913b = fd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37912a) {
            case 0:
                this.f37913b.h.f39815s.setVisibility(8);
                return;
            default:
                this.f37913b.h.f39808a.setVisibility(8);
                return;
        }
    }
}
