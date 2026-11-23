package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e10 extends AnimatorListenerAdapter {
    public final int f34526a;
    public final g10 f34527b;

    public e10(g10 g10Var, int i7) {
        this.f34526a = i7;
        this.f34527b = g10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34526a) {
            case 0:
                g10 g10Var = this.f34527b;
                org.telegram.messenger.ks.f(g10Var.f35277r.f35610a).j(g10Var.f35275f);
                g10Var.requestLayout();
                return;
            default:
                g10 g10Var2 = this.f34527b;
                g10Var2.d = null;
                g10Var2.f35271a = null;
                g10Var2.f35272b = false;
                return;
        }
    }
}
