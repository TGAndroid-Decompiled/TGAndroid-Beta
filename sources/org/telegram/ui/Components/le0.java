package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f25909a;
    public final pe0 f25910b;

    public le0(pe0 pe0Var, int i10) {
        this.f25909a = i10;
        this.f25910b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25909a) {
            case 0:
                this.f25910b.f27030x = null;
                return;
            default:
                this.f25910b.f27031y = null;
                return;
        }
    }
}
