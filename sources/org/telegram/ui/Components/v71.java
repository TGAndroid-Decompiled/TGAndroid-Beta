package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v71 extends AnimatorListenerAdapter {
    public final int f40580a;
    public final w71 f40581b;

    public v71(w71 w71Var, int i7) {
        this.f40580a = i7;
        this.f40581b = w71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40580a) {
            case 0:
                this.f40581b.E = null;
                return;
            default:
                this.f40581b.E = null;
                return;
        }
    }
}
