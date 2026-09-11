package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f28162a;
    public final pe0 f28163b;

    public le0(pe0 pe0Var, int i10) {
        this.f28162a = i10;
        this.f28163b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28162a) {
            case 0:
                this.f28163b.f29364x = null;
                return;
            default:
                this.f28163b.f29365y = null;
                return;
        }
    }
}
