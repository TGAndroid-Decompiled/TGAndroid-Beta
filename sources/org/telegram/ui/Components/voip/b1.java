package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b1 extends AnimatorListenerAdapter {
    public final int f33444a;
    public final g1 f33445b;

    public b1(g1 g1Var, int i9) {
        this.f33444a = i9;
        this.f33445b = g1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f33444a) {
            case 1:
                this.f33445b.H = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f33444a) {
            case 0:
                xe.d dVar = this.f33445b.K;
                if (dVar == null || (view = dVar.f49151j) == null) {
                    return;
                }
                dVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
