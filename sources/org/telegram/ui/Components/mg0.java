package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mg0 extends AnimatorListenerAdapter {
    public final int f28594a;
    public final ng0 f28595b;

    public mg0(ng0 ng0Var, int i10) {
        this.f28594a = i10;
        this.f28595b = ng0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28594a) {
            case 0:
                this.f28595b.f28906a.f29273n.setVisibility(8);
                return;
            default:
                this.f28595b.f28906a.h.setVisibility(8);
                return;
        }
    }
}
