package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vx0 extends AnimatorListenerAdapter {
    public final int f30338a;
    public final wx0 f30339b;

    public vx0(wx0 wx0Var, int i10) {
        this.f30338a = i10;
        this.f30339b = wx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30338a) {
            case 0:
                this.f30339b.f30693s.setVisibility(8);
                return;
            case 1:
                this.f30339b.f30693s.setVisibility(8);
                return;
            default:
                this.f30339b.f30693s.setVisibility(8);
                return;
        }
    }
}
