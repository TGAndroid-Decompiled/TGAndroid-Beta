package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u71 extends AnimatorListenerAdapter {
    public final int f40287a;
    public final v71 f40288b;

    public u71(v71 v71Var, int i7) {
        this.f40287a = i7;
        this.f40288b = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40287a) {
            case 0:
                this.f40288b.E = null;
                return;
            default:
                this.f40288b.E = null;
                return;
        }
    }
}
