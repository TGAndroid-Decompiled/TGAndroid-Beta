package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f28163a;
    public final pe0 f28164b;

    public le0(pe0 pe0Var, int i10) {
        this.f28163a = i10;
        this.f28164b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28163a) {
            case 0:
                this.f28164b.f29365x = null;
                return;
            default:
                this.f28164b.f29366y = null;
                return;
        }
    }
}
