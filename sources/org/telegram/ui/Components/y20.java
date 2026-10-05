package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y20 extends AnimatorListenerAdapter {
    public final int f33156a;
    public final d30 f33157b;

    public y20(d30 d30Var, int i10) {
        this.f33156a = i10;
        this.f33157b = d30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33156a) {
            case 0:
                d30 d30Var = this.f33157b;
                d30Var.f25603b.setVisibility(8);
                d30Var.f25614y = false;
                d30Var.E = 0.0f;
                return;
            default:
                this.f33157b.f25607e.setVisibility(8);
                return;
        }
    }
}
