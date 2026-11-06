package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34817a;
    public final p10 f34818b;

    public j10(p10 p10Var, int i7) {
        this.f34817a = i7;
        this.f34818b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34817a) {
            case 0:
                p10 p10Var = this.f34818b;
                p10Var.f36733b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                return;
            default:
                this.f34818b.f36738e.setVisibility(8);
                return;
        }
    }
}
