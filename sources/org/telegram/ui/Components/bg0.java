package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24948a;
    public final cg0 f24949b;

    public bg0(cg0 cg0Var, int i10) {
        this.f24948a = i10;
        this.f24949b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24948a) {
            case 0:
                this.f24949b.f25363a.f25720n.setVisibility(8);
                return;
            default:
                this.f24949b.f25363a.h.setVisibility(8);
                return;
        }
    }
}
