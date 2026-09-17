package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f25894a;
    public final pe0 f25895b;

    public le0(pe0 pe0Var, int i10) {
        this.f25894a = i10;
        this.f25895b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25894a) {
            case 0:
                this.f25895b.f27017x = null;
                return;
            default:
                this.f25895b.f27018y = null;
                return;
        }
    }
}
