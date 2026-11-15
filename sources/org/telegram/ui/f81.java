package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f81 extends AnimatorListenerAdapter {
    public final int f47071a;
    public final g81 f47072b;

    public f81(g81 g81Var, int i7) {
        this.f47071a = i7;
        this.f47072b = g81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47071a) {
            case 0:
                this.f47072b.f47377b.f48898s.setVisibility(8);
                return;
            default:
                this.f47072b.f47377b.f48891a.setVisibility(8);
                return;
        }
    }
}
