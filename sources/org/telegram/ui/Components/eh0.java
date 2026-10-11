package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eh0 extends AnimatorListenerAdapter {
    public final int f26094a;
    public final hh0 f26095b;

    public eh0(hh0 hh0Var, int i10) {
        this.f26094a = i10;
        this.f26095b = hh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26094a) {
            case 0:
                this.f26095b.F = null;
                return;
            default:
                this.f26095b.u();
                return;
        }
    }
}
