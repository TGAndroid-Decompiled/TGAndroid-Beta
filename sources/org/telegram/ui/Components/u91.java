package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u91 extends AnimatorListenerAdapter {
    public final int f31349a;
    public final v91 f31350b;

    public u91(v91 v91Var, int i10) {
        this.f31349a = i10;
        this.f31350b = v91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31349a) {
            case 0:
                this.f31350b.f31624y = null;
                return;
            default:
                this.f31350b.f31624y = null;
                return;
        }
    }
}
