package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h30 extends AnimatorListenerAdapter {
    public final int f35627a;
    public final j30 f35628b;

    public h30(j30 j30Var, int i7) {
        this.f35627a = i7;
        this.f35628b = j30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35627a) {
            case 0:
                j30 j30Var = this.f35628b;
                j30Var.d = null;
                lo loVar = new lo(this, 22);
                j30Var.f36251e = loVar;
                org.telegram.messenger.g0.h3(loVar, j30Var.f36256w);
                return;
            default:
                j30 j30Var2 = this.f35628b;
                j30Var2.setVisibility(4);
                j30Var2.f36250c = null;
                j30Var2.d = null;
                return;
        }
    }
}
