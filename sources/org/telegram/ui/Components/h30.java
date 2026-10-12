package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h30 extends AnimatorListenerAdapter {
    public final int f25498a;
    public final m30 f25499b;

    public h30(m30 m30Var, int i10) {
        this.f25498a = i10;
        this.f25499b = m30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25498a) {
            case 0:
                m30 m30Var = this.f25499b;
                m30Var.f27179b.setVisibility(8);
                m30Var.f27189y = false;
                m30Var.E = 0.0f;
                return;
            default:
                this.f25499b.e.setVisibility(8);
                return;
        }
    }
}
