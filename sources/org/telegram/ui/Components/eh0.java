package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eh0 extends AnimatorListenerAdapter {
    public final int f26048a;
    public final hh0 f26049b;

    public eh0(hh0 hh0Var, int i10) {
        this.f26048a = i10;
        this.f26049b = hh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26048a) {
            case 0:
                this.f26049b.F = null;
                return;
            default:
                this.f26049b.u();
                return;
        }
    }
}
