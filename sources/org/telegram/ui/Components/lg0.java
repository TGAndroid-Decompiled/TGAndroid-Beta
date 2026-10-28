package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f30248a;
    public final mg0 f30249b;

    public lg0(mg0 mg0Var, int i10) {
        this.f30248a = i10;
        this.f30249b = mg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30248a) {
            case 0:
                this.f30249b.f30537a.f30910n.setVisibility(8);
                return;
            default:
                this.f30249b.f30537a.h.setVisibility(8);
                return;
        }
    }
}
