package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f28190a;
    public final pe0 f28191b;

    public le0(pe0 pe0Var, int i10) {
        this.f28190a = i10;
        this.f28191b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28190a) {
            case 0:
                this.f28191b.f29392x = null;
                return;
            default:
                this.f28191b.f29393y = null;
                return;
        }
    }
}
