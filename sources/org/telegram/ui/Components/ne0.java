package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne0 extends AnimatorListenerAdapter {
    public final int f30973a;
    public final pe0 f30974b;

    public ne0(pe0 pe0Var, int i10) {
        this.f30973a = i10;
        this.f30974b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30973a) {
            case 0:
                this.f30974b.f31663s = null;
                return;
            default:
                this.f30974b.v = null;
                return;
        }
    }
}
