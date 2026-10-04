package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u91 extends AnimatorListenerAdapter {
    public final int f31350a;
    public final v91 f31351b;

    public u91(v91 v91Var, int i10) {
        this.f31350a = i10;
        this.f31351b = v91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31350a) {
            case 0:
                this.f31351b.f31625y = null;
                return;
            default:
                this.f31351b.f31625y = null;
                return;
        }
    }
}
