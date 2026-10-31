package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b20 extends AnimatorListenerAdapter {
    public final int f24506a;
    public final g20 f24507b;

    public b20(g20 g20Var, int i10) {
        this.f24506a = i10;
        this.f24507b = g20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24506a) {
            case 0:
                g20 g20Var = this.f24507b;
                g20Var.f26228b.setVisibility(8);
                g20Var.D = false;
                g20Var.E = 0.0f;
                return;
            default:
                this.f24507b.e.setVisibility(8);
                return;
        }
    }
}
