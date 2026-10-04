package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24947a;
    public final cg0 f24948b;

    public bg0(cg0 cg0Var, int i10) {
        this.f24947a = i10;
        this.f24948b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24947a) {
            case 0:
                this.f24948b.f25362a.f25719n.setVisibility(8);
                return;
            default:
                this.f24948b.f25362a.h.setVisibility(8);
                return;
        }
    }
}
