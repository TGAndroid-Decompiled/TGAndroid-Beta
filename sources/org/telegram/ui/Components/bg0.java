package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24968a;
    public final cg0 f24969b;

    public bg0(cg0 cg0Var, int i10) {
        this.f24968a = i10;
        this.f24969b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24968a) {
            case 0:
                this.f24969b.f25416a.f25780n.setVisibility(8);
                return;
            default:
                this.f24969b.f25416a.h.setVisibility(8);
                return;
        }
    }
}
