package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fe1 extends AnimatorListenerAdapter {
    public final int f36288a;
    public final ge1 f36289b;

    public fe1(ge1 ge1Var, int i10) {
        this.f36288a = i10;
        this.f36289b = ge1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36288a) {
            case 0:
                this.f36289b.h.f38304s.setVisibility(8);
                return;
            default:
                this.f36289b.h.f38297a.setVisibility(8);
                return;
        }
    }
}
