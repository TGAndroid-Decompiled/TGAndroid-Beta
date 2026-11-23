package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u71 extends AnimatorListenerAdapter {
    public final int f40288a;
    public final v71 f40289b;

    public u71(v71 v71Var, int i7) {
        this.f40288a = i7;
        this.f40289b = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40288a) {
            case 0:
                this.f40289b.E = null;
                return;
            default:
                this.f40289b.E = null;
                return;
        }
    }
}
