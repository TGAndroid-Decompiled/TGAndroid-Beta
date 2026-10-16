package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h30 extends AnimatorListenerAdapter {
    public final int f25166a;
    public final m30 f25167b;

    public h30(m30 m30Var, int i10) {
        this.f25166a = i10;
        this.f25167b = m30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25166a) {
            case 0:
                m30 m30Var = this.f25167b;
                m30Var.f26897b.setVisibility(8);
                m30Var.f26907y = false;
                m30Var.E = 0.0f;
                return;
            default:
                this.f25167b.e.setVisibility(8);
                return;
        }
    }
}
