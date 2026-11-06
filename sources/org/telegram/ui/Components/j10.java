package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34853a;
    public final p10 f34854b;

    public j10(p10 p10Var, int i7) {
        this.f34853a = i7;
        this.f34854b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34853a) {
            case 0:
                p10 p10Var = this.f34854b;
                p10Var.f36849b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                return;
            default:
                this.f34854b.f36854e.setVisibility(8);
                return;
        }
    }
}
