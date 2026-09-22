package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f25912a;
    public final pe0 f25913b;

    public le0(pe0 pe0Var, int i10) {
        this.f25912a = i10;
        this.f25913b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25912a) {
            case 0:
                this.f25913b.f27027x = null;
                return;
            default:
                this.f25913b.f27028y = null;
                return;
        }
    }
}
