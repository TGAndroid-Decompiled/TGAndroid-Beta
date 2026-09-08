package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f28189a;
    public final pe0 f28190b;

    public le0(pe0 pe0Var, int i10) {
        this.f28189a = i10;
        this.f28190b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28189a) {
            case 0:
                this.f28190b.f29391x = null;
                return;
            default:
                this.f28190b.f29392y = null;
                return;
        }
    }
}
