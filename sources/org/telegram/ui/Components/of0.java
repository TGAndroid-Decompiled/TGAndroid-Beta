package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f26775a;
    public final pf0 f26776b;

    public of0(pf0 pf0Var, int i10) {
        this.f26775a = i10;
        this.f26776b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26775a) {
            case 0:
                this.f26776b.f27033a.f27326n.setVisibility(8);
                return;
            default:
                this.f26776b.f27033a.h.setVisibility(8);
                return;
        }
    }
}
