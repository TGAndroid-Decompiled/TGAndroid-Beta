package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24952a;
    public final cg0 f24953b;

    public bg0(cg0 cg0Var, int i10) {
        this.f24952a = i10;
        this.f24953b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24952a) {
            case 0:
                this.f24953b.f25368a.f25725n.setVisibility(8);
                return;
            default:
                this.f24953b.f25368a.h.setVisibility(8);
                return;
        }
    }
}
