package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class b1 extends AnimatorListenerAdapter {

    public final int f33494a;

    public final g1 f33495b;

    public b1(g1 g1Var, int i10) {
        this.f33494a = i10;
        this.f33495b = g1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f33494a) {
            case 1:
                this.f33495b.H = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f33494a) {
            case 0:
                ye.d dVar = this.f33495b.K;
                if (dVar != null && (view = dVar.f49867j) != null) {
                    dVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }
}
