package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f25897a;
    public final pe0 f25898b;

    public le0(pe0 pe0Var, int i10) {
        this.f25897a = i10;
        this.f25898b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25897a) {
            case 0:
                this.f25898b.f27020x = null;
                return;
            default:
                this.f25898b.f27021y = null;
                return;
        }
    }
}
