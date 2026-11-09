package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k81 extends AnimatorListenerAdapter {
    public final int f47238a;
    public final o81 f47239b;

    public k81(o81 o81Var, int i7) {
        this.f47238a = i7;
        this.f47239b = o81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47238a) {
            case 0:
                o81 o81Var = this.f47239b;
                o81Var.f48407w = 0;
                o81Var.f48404n.setVisibility(8);
                return;
            case 1:
                this.f47239b.f48407w = 0;
                return;
            default:
                this.f47239b.F.setVisibility(8);
                return;
        }
    }
}
